package de.yadrone.base.command;

import java.io.UnsupportedEncodingException;

public abstract class ATCommand extends DroneCommand {
    private String encodeParameter(final Object p) {
        if (p instanceof Integer) {
            return p.toString();
        }

        if (p instanceof Float) {
            return Integer.toString(Float.floatToIntBits((Float) p));
        }

        if (p instanceof String) {
            return "\"" + p + "\"";
        }

        throw new IllegalArgumentException("Unsupported parameter type: " + p.getClass().getName() + " " + p);
    }

    public String getCommandString(final int seq) {
        return "AT*" + getID() + "=" + seq + getParametersString() + "\r";
    }

    protected abstract String getID();

    public byte[] getPacket(final int seq) {
        try {
            return getCommandString(seq).getBytes("ASCII");
        } catch (final UnsupportedEncodingException e) {
            // never happens
            return null;
        }
    }

    protected abstract Object[] getParameters();

    private String getParametersString() {
        final StringBuffer sb = new StringBuffer();
        for (final Object p : getParameters()) {
            sb.append(',').append(encodeParameter(p));
        }

        return sb.toString();
    }

    @Override
    public Priority getPriority() {
        return Priority.MIN_PRIORITY;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName());
        builder.append(" [ID=");
        builder.append(getID());
        builder.append(", param=");
        builder.append(getParametersString());
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null || !(obj instanceof ATCommand)) {
            return false;
        }
        final ATCommand o = (ATCommand) obj;
        return o.getCommandString(0).equals(getCommandString(0));
    }

    public boolean needControlAck() {
        return false;
    }

}
