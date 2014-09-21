package de.yadrone.base.command;

public class ManualTrimCommand extends ATCommand {
    private final float pitch;
    private final float roll;
    private final float yaw;

    public ManualTrimCommand(final float pitch, final float roll, final float yaw) {
        super();
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
    }

    @Override
    protected String getID() {
        // TODO Auto-generated method stub
        return "MTRIM";
    }

    @Override
    protected Object[] getParameters() {
        // TODO Auto-generated method stub
        return new Object[] {pitch, roll, yaw};
    }

}
