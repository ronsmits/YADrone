package de.yadrone.base.command;

public class RawCaptureCommand extends ATCommand {

    private final int picture;
    private final int video;

    public RawCaptureCommand(final boolean picture, final boolean video) {
        super();
        this.picture = picture ? 1 : 0;
        this.video = video ? 1 : 0;
    }

    @Override
    protected String getID() {
        return "CAP";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {picture, video};
    }

}
