package de.yadrone.base.navdata;

import java.util.Arrays;

public class GyroRawData {

    private final short[] raw_gyros;
    private final short[] raw_gyros_110;

    public GyroRawData(final short[] raw_gyros, final short[] raw_gyros_110) {
        this.raw_gyros = raw_gyros;
        this.raw_gyros_110 = raw_gyros_110;
    }

    /**
     * @return the raw_gyros
     */
    public short[] getRawGyros() {
        return raw_gyros;
    }

    /**
     * @return the raw_gyros_110
     */
    public short[] getRawGyros110() {
        return raw_gyros_110;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("GyroRawData [raw_gyros=");
        builder.append(Arrays.toString(raw_gyros));
        builder.append(", raw_gyros_110=");
        builder.append(Arrays.toString(raw_gyros_110));
        builder.append("]");
        return builder.toString();
    }

}
