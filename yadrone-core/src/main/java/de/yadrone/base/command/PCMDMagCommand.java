package de.yadrone.base.command;

public class PCMDMagCommand extends PCMDCommand {
    protected float magneto_psi;
    protected float magneto_psi_accuracy;

    public PCMDMagCommand(final boolean hover, final boolean combined_yaw_enabled, final boolean absolutecontrol,
            final float left_right_tilt, final float front_back_tilt, final float vertical_speed,
            final float angular_speed, final float magneto_psi, final float magneto_psi_accuracy) {
        super(hover, combined_yaw_enabled, left_right_tilt, front_back_tilt, vertical_speed, angular_speed);
        this.magneto_psi = magneto_psi;
        this.magneto_psi_accuracy = magneto_psi_accuracy;
        if (absolutecontrol) {
            mode |= 1 << 2;
        }

    }

    @Override
    protected String getID() {
        return "PCMD_MAG";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {mode, left_right_tilt, front_back_tilt, vertical_speed, angular_speed, magneto_psi,
                magneto_psi_accuracy};
    }
}
