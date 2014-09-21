package de.yadrone.base.navdata;

import java.util.Arrays;

public class ReferencesData {
    private final int ref_theta;
    private final int ref_phi;
    private final int ref_theta_I;
    private final int ref_phi_I;
    private final int ref_pitch;
    private final int ref_roll;
    private final int ref_yaw;
    private final int ref_psi;
    private final float[] v_ref;
    private final float theta_mod;
    private final float phi_mod;
    private final float[] k_v;
    private final int k_mode;
    private final float ui_time;
    private final float ui_theta;
    private final float ui_phi;
    private final float ui_psi;
    private final float ui_psi_accuracy;
    private final int ui_seq;

    public ReferencesData(final int ref_theta, final int ref_phi, final int ref_theta_I, final int ref_phi_I,
            final int ref_pitch, final int ref_roll, final int ref_yaw, final int ref_psi, final float[] v_ref,
            final float theta_mod, final float phi_mod, final float[] k_v, final int k_mode, final float ui_time,
            final float ui_theta, final float ui_phi, final float ui_psi, final float ui_psi_accuracy, final int ui_seq) {
        super();
        this.ref_theta = ref_theta;
        this.ref_phi = ref_phi;
        this.ref_theta_I = ref_theta_I;
        this.ref_phi_I = ref_phi_I;
        this.ref_pitch = ref_pitch;
        this.ref_roll = ref_roll;
        this.ref_yaw = ref_yaw;
        this.ref_psi = ref_psi;
        this.v_ref = v_ref;
        this.theta_mod = theta_mod;
        this.phi_mod = phi_mod;
        this.k_v = k_v;
        this.k_mode = k_mode;
        this.ui_time = ui_time;
        this.ui_theta = ui_theta;
        this.ui_phi = ui_phi;
        this.ui_psi = ui_psi;
        this.ui_psi_accuracy = ui_psi_accuracy;
        this.ui_seq = ui_seq;
    }

    /**
     * @return the ref_theta
     */
    public int getRefTheta() {
        return ref_theta;
    }

    /**
     * @return the ref_phi
     */
    public int getRefPhi() {
        return ref_phi;
    }

    /**
     * @return the ref_theta_I
     */
    public int getRefThetaI() {
        return ref_theta_I;
    }

    /**
     * @return the ref_phi_I
     */
    public int getRefPhiI() {
        return ref_phi_I;
    }

    /**
     * @return the ref_pitch
     */
    public int getRefPitch() {
        return ref_pitch;
    }

    /**
     * @return the ref_roll
     */
    public int getRefRoll() {
        return ref_roll;
    }

    /**
     * @return the ref_yaw
     */
    public int getRefYaw() {
        return ref_yaw;
    }

    /**
     * @return the ref_psi
     */
    public int getRefPsi() {
        return ref_psi;
    }

    /**
     * @return the v_ref
     */
    public float[] getVRef() {
        return v_ref;
    }

    /**
     * @return the theta_mod
     */
    public float getThetaMod() {
        return theta_mod;
    }

    /**
     * @return the phi_mod
     */
    public float getPhiMod() {
        return phi_mod;
    }

    /**
     * @return the k_v
     */
    public float[] getKV() {
        return k_v;
    }

    /**
     * @return the k_mode
     */
    public int getKMode() {
        return k_mode;
    }

    /**
     * @return the ui_time
     */
    public float getUiTime() {
        return ui_time;
    }

    /**
     * @return the ui_theta
     */
    public float getUiTheta() {
        return ui_theta;
    }

    /**
     * @return the ui_phi
     */
    public float getUiPhi() {
        return ui_phi;
    }

    /**
     * @return the ui_psi
     */
    public float getUiPsi() {
        return ui_psi;
    }

    /**
     * @return the ui_psi_accuracy
     */
    public float getUiPsiAccuracy() {
        return ui_psi_accuracy;
    }

    /**
     * @return the ui_seq
     */
    public int getUiSeq() {
        return ui_seq;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ReferencesData [ref_theta=");
        builder.append(ref_theta);
        builder.append(", ref_phi=");
        builder.append(ref_phi);
        builder.append(", ref_theta_I=");
        builder.append(ref_theta_I);
        builder.append(", ref_phi_I=");
        builder.append(ref_phi_I);
        builder.append(", ref_pitch=");
        builder.append(ref_pitch);
        builder.append(", ref_roll=");
        builder.append(ref_roll);
        builder.append(", ref_yaw=");
        builder.append(ref_yaw);
        builder.append(", ref_psi=");
        builder.append(ref_psi);
        builder.append(", v_ref=");
        builder.append(Arrays.toString(v_ref));
        builder.append(", theta_mod=");
        builder.append(theta_mod);
        builder.append(", phi_mod=");
        builder.append(phi_mod);
        builder.append(", k_v=");
        builder.append(Arrays.toString(k_v));
        builder.append(", k_mode=");
        builder.append(k_mode);
        builder.append(", ui_time=");
        builder.append(ui_time);
        builder.append(", ui_theta=");
        builder.append(ui_theta);
        builder.append(", ui_phi=");
        builder.append(ui_phi);
        builder.append(", ui_psi=");
        builder.append(ui_psi);
        builder.append(", ui_psi_accuracy=");
        builder.append(ui_psi_accuracy);
        builder.append(", ui_seq=");
        builder.append(ui_seq);
        builder.append("]");
        return builder.toString();
    }

}
