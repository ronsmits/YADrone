package de.yadrone.base.navdata;

import java.util.Arrays;

public class VisionData {
    private final int vision_state;
    private final int vision_misc;
    private final float vision_phi_trim;
    private final float vision_phi_ref_prop;
    private final float vision_theta_trim;
    private final float vision_theta_ref_prop;
    private final int new_raw_picture;
    private final float theta_capture;
    private final float phi_capture;
    private final float psi_capture;
    private final int altitude_capture;
    private final int time_capture_seconds;
    private final int time_capture_useconds;
    private final float[] body_v;
    private final float delta_phi;
    private final float delta_theta;
    private final float delta_psi;
    private final int gold_defined;
    private final int gold_reset;
    private final float gold_x;
    private final float gold_y;

    public VisionData(final int vision_state, final int vision_misc, final float vision_phi_trim,
            final float vision_phi_ref_prop, final float vision_theta_trim, final float vision_theta_ref_prop,
            final int new_raw_picture, final float theta_capture, final float phi_capture, final float psi_capture,
            final int altitude_capture, final int time_capture_seconds, final int time_capture_useconds,
            final float[] body_v, final float delta_phi, final float delta_theta, final float delta_psi,
            final int gold_defined, final int gold_reset, final float gold_x, final float gold_y) {
        super();
        this.vision_state = vision_state;
        this.vision_misc = vision_misc;
        this.vision_phi_trim = vision_phi_trim;
        this.vision_phi_ref_prop = vision_phi_ref_prop;
        this.vision_theta_trim = vision_theta_trim;
        this.vision_theta_ref_prop = vision_theta_ref_prop;
        this.new_raw_picture = new_raw_picture;
        this.theta_capture = theta_capture;
        this.phi_capture = phi_capture;
        this.psi_capture = psi_capture;
        this.altitude_capture = altitude_capture;
        this.time_capture_seconds = time_capture_seconds;
        this.time_capture_useconds = time_capture_useconds;
        this.body_v = body_v;
        this.delta_phi = delta_phi;
        this.delta_theta = delta_theta;
        this.delta_psi = delta_psi;
        this.gold_defined = gold_defined;
        this.gold_reset = gold_reset;
        this.gold_x = gold_x;
        this.gold_y = gold_y;
    }

    /**
     * @return the vision_state
     */
    public int getVisionState() {
        return vision_state;
    }

    /**
     * @return the vision_misc
     */
    public int getVisionMisc() {
        return vision_misc;
    }

    /**
     * @return the vision_phi_trim
     */
    public float getVisionPhiTrim() {
        return vision_phi_trim;
    }

    /**
     * @return the vision_phi_ref_prop
     */
    public float getVisionPhiRefProp() {
        return vision_phi_ref_prop;
    }

    /**
     * @return the vision_theta_trim
     */
    public float getVisionThetaTrim() {
        return vision_theta_trim;
    }

    /**
     * @return the vision_theta_ref_prop
     */
    public float getVisionThetaRefProp() {
        return vision_theta_ref_prop;
    }

    /**
     * @return the new_raw_picture
     */
    public int getNewRawPicture() {
        return new_raw_picture;
    }

    /**
     * @return the theta_capture
     */
    public float getThetaCapture() {
        return theta_capture;
    }

    /**
     * @return the phi_capture
     */
    public float getPhiCapture() {
        return phi_capture;
    }

    /**
     * @return the psi_capture
     */
    public float getPsiCapture() {
        return psi_capture;
    }

    /**
     * @return the altitude_capture
     */
    public int getAltitudeCapture() {
        return altitude_capture;
    }

    /**
     * @return the time_capture_seconds
     */
    public int getTimeCaptureSeconds() {
        return time_capture_seconds;
    }

    /**
     * @return the time_capture_useconds
     */
    public int getTimeCaptureUseconds() {
        return time_capture_useconds;
    }

    /**
     * @return the body_v
     */
    public float[] getBodyV() {
        return body_v;
    }

    /**
     * @return the delta_phi
     */
    public float getDeltaPhi() {
        return delta_phi;
    }

    /**
     * @return the delta_theta
     */
    public float getDeltaTheta() {
        return delta_theta;
    }

    /**
     * @return the delta_psi
     */
    public float getDeltaPsi() {
        return delta_psi;
    }

    /**
     * @return the gold_defined
     */
    public int getGoldDefined() {
        return gold_defined;
    }

    /**
     * @return the gold_reset
     */
    public int getGoldReset() {
        return gold_reset;
    }

    /**
     * @return the gold_x
     */
    public float getGoldX() {
        return gold_x;
    }

    /**
     * @return the gold_y
     */
    public float getGoldY() {
        return gold_y;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("VisionData [vision_state=");
        builder.append(vision_state);
        builder.append(", vision_misc=");
        builder.append(vision_misc);
        builder.append(", vision_phi_trim=");
        builder.append(vision_phi_trim);
        builder.append(", vision_phi_ref_prop=");
        builder.append(vision_phi_ref_prop);
        builder.append(", vision_theta_trim=");
        builder.append(vision_theta_trim);
        builder.append(", vision_theta_ref_prop=");
        builder.append(vision_theta_ref_prop);
        builder.append(", new_raw_picture=");
        builder.append(new_raw_picture);
        builder.append(", theta_capture=");
        builder.append(theta_capture);
        builder.append(", phi_capture=");
        builder.append(phi_capture);
        builder.append(", psi_capture=");
        builder.append(psi_capture);
        builder.append(", altitude_capture=");
        builder.append(altitude_capture);
        builder.append(", time_capture_seconds=");
        builder.append(time_capture_seconds);
        builder.append(", time_capture_useconds=");
        builder.append(time_capture_useconds);
        builder.append(", body_v=");
        builder.append(Arrays.toString(body_v));
        builder.append(", delta_phi=");
        builder.append(delta_phi);
        builder.append(", delta_theta=");
        builder.append(delta_theta);
        builder.append(", delta_psi=");
        builder.append(delta_psi);
        builder.append(", gold_defined=");
        builder.append(gold_defined);
        builder.append(", gold_reset=");
        builder.append(gold_reset);
        builder.append(", gold_x=");
        builder.append(gold_x);
        builder.append(", gold_y=");
        builder.append(gold_y);
        builder.append("]");
        return builder.toString();
    }

}
