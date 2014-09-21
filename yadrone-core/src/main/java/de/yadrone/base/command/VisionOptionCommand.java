package de.yadrone.base.command;

public class VisionOptionCommand extends ATCommand {

    private final int option;

    public VisionOptionCommand(final int option) {
        super();
        this.option = option;
    }

    @Override
    protected String getID() {
        return "VISO";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {option};
    }

}
