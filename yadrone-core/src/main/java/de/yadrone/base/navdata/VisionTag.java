package de.yadrone.base.navdata;

import java.util.Arrays;

import de.yadrone.base.command.DetectionType;

public class VisionTag {

    // Type of the detected tag #i ; see the CAD_TYPE enumeration.
    private final int type;

    /**
     * X and Y coordinates of detected 2D-tag #i inside the picture, with (0, 0) being the top-left corner, and (1000,
     * 1000) the right-bottom corner regardless the picture resolu- tion or the source camera.
     */
    private final int x;
    private final int y;

    /**
     * Width and height of the detection bounding-box (2D-tag #i), when applicable.
     */
    private final int width;
    private final int height;

    /**
     * Distance from camera to detected 2D-tag #i in centimeters, when applicable.
     */
    private final int distance;

    float orientationAngle;
    float[][] rotation;
    float[] translation;
    DetectionType source;

    public VisionTag(final int type, final int x, final int y, final int width, final int height, final int distance,
            final float orientation_angle, final float[][] rotation, final float[] translation,
            final DetectionType source) {
        super();
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.distance = distance;
        this.orientationAngle = orientation_angle;
        this.rotation = rotation;
        this.translation = translation;
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDistance() {
        return distance;
    }

    /**
     * @return the orientation_angle
     */
    public float getOrientationAngle() {
        return orientationAngle;
    }

    /**
     * @return the rotation
     */
    public float[][] getRotation() {
        return rotation;
    }

    /**
     * @return the translation
     */
    public float[] getTranslation() {
        return translation;
    }

    /**
     * @return the camera_source
     */
    public DetectionType getSource() {
        return source;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("VisionTag [type=");
        builder.append(type);
        builder.append(", x=");
        builder.append(x);
        builder.append(", y=");
        builder.append(y);
        builder.append(", width=");
        builder.append(width);
        builder.append(", height=");
        builder.append(height);
        builder.append(", distance=");
        builder.append(distance);
        builder.append(", orientationAngle=");
        builder.append(orientationAngle);
        builder.append(", rotation=");
        builder.append(Arrays.toString(rotation));
        builder.append(", translation=");
        builder.append(Arrays.toString(translation));
        builder.append(", cameraSource=");
        builder.append(source);
        builder.append("]");
        return builder.toString();
    }

}
