package de.yadrone.base.command;

public class MiscCommand extends ATCommand {
    protected int arg1;
    protected int arg2;
    protected int arg3;
    protected int arg4;

    public MiscCommand(final int arg1, final int arg2, final int arg3, final int arg4) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
    }

    @Override
    protected String getID() {
        return "MISC";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {arg1, arg2, arg3, arg4};
    }

    @Override
    public Priority getPriority() {
        return Priority.MAX_PRIORITY;
    }

}
