package de.yadrone.base.navdata;

import java.util.Arrays;

public class AcceleroPhysData {

    private final float accs_temp;
    private final float[] phys_accs;
    private final int alim3v3;

    public AcceleroPhysData(final float accs_temp, final float[] phys_accs, final int alim3v3) {
        super();
        this.accs_temp = accs_temp;
        this.phys_accs = phys_accs;
        this.alim3v3 = alim3v3;
    }

    /**
     * @return the accs_temp
     */
    public float getAccsTemp() {
        return accs_temp;
    }

    /**
     * @return the phys_accs
     */
    public float[] getPhysAccs() {
        return phys_accs;
    }

    /**
     * @return the alim3v3
     */
    public int getAlim3v3() {
        return alim3v3;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AcceleroPhysData [accs_temp=");
        builder.append(accs_temp);
        builder.append(", phys_accs=");
        builder.append(Arrays.toString(phys_accs));
        builder.append(", alim3v3=");
        builder.append(alim3v3);
        builder.append("]");
        return builder.toString();
    }

}
