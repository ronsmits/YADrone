package de.yadrone.base.command;

public class LEDAnimationCommand extends ConfigureCommand {
    protected int animation_no;
    protected float frequency;
    protected int duration;

    public LEDAnimationCommand(final LEDAnimation anim, final float frequency, final int duration) {
        super("leds:leds_anim", String.valueOf(anim.ordinal()) + "," + String.valueOf(Float.floatToIntBits(frequency))
                + "," + String.valueOf(duration));
    }

}
