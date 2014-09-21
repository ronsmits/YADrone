package de.yadrone.base.command;

public class ConfigureCommand extends ATCommand {
    protected String name;
    protected String value;

    public ConfigureCommand(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public ConfigureCommand(final String name, final int value) {
        this(name, String.valueOf(value));
    }

    public ConfigureCommand(final String name, final long l) {
        this(name, String.valueOf(l));
    }

    public ConfigureCommand(final String name, final double d) {
        this(name, Double.doubleToLongBits(d));
    }

    public ConfigureCommand(final String name, final boolean b) {
        this(name, String.valueOf(b));
    }

    @Override
    protected String getID() {
        return "CONFIG";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {name, value};
    }

    @Override
    public boolean needControlAck() {
        return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ConfigureCommand [name=");
        builder.append(name);
        builder.append(", value=");
        builder.append(value);
        builder.append(", qorder=");
        builder.append(qorder);
        builder.append("]");
        return builder.toString();
    }

}
