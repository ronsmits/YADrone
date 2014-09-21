package de.yadrone.base.command;

public class GainsCommand extends ATCommand {

    int pq_kp; // Gain for proportional correction in pitch (p) and roll (q) angular rate control
    int r_kp; // Gain for proportional correction in yaw (r) angular rate control
    int r_ki; // Gain for integral correction in yaw (r) angular rate control
    int ea_kp; // Gain for proportional correction in Euler angle control
    int ea_ki; // Gain for integral correction in Euler angle control
    int alt_kp; // Gain for proportional correction in Altitude control
    int alt_ki; // Gain for integral correction in Altitude control
    int vz_kp; // Gain for proportional correction in Vz control
    int vz_ki; // Gain for integral correction in Vz control
    int hovering_kp; // Gain for proportional correction in hovering control
    int hovering_ki; // Gain for integral correction in hovering control
    int hovering_b_kp; // Gain for proportional correction in hovering beacon control
    int hovering_b_ki; // Gain for integral correction in hovering beacon control

    public GainsCommand(final int pq_kp, final int r_kp, final int r_ki, final int ea_kp, final int ea_ki,
            final int alt_kp, final int alt_ki, final int vz_kp, final int vz_ki, final int hovering_kp,
            final int hovering_ki, final int hovering_b_kp, final int hovering_b_ki) {
        super();
        this.pq_kp = pq_kp;
        this.r_kp = r_kp;
        this.r_ki = r_ki;
        this.ea_kp = ea_kp;
        this.ea_ki = ea_ki;
        this.alt_kp = alt_kp;
        this.alt_ki = alt_ki;
        this.vz_kp = vz_kp;
        this.vz_ki = vz_ki;
        this.hovering_kp = hovering_kp;
        this.hovering_ki = hovering_ki;
        this.hovering_b_kp = hovering_b_kp;
        this.hovering_b_ki = hovering_b_ki;
    }

    @Override
    protected String getID() {
        return "GAIN";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {pq_kp, r_kp, r_ki, ea_kp, ea_ki, alt_kp, alt_ki, vz_kp, vz_ki, hovering_kp, hovering_ki,
                hovering_b_kp, hovering_b_ki};
    }
}
