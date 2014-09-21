package de.yadrone.base.command;

public class FlightAnimationCommand extends ConfigureCommand {

    public FlightAnimationCommand(final FlightAnimation anim, final int duration) {
        super("control:flight_anim", String.valueOf(anim.ordinal()) + "," + String.valueOf(duration));
    }

    public FlightAnimationCommand(final FlightAnimation anim) {
        this(anim, anim.getDefaultDuration());
    }
}
