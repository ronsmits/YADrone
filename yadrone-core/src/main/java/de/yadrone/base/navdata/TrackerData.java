package de.yadrone.base.navdata;

import java.util.Arrays;

public class TrackerData {
    private final int[][][] trackers;

    public TrackerData(final int[][][] trackers) {
        super();
        this.trackers = trackers;
    }

    /**
     * getTrackers()[i][j][0]: locked <br>
     * getTrackers()[i][j][1]: point.x <br>
     * getTrackers()[i][j][2]: point.y
     */
    public int[][][] getTrackers() {
        return trackers;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("TrackersData [trackers=");
        for (final int[][] tracker : trackers) {
            builder.append("[");
            for (int j = 0; j < tracker.length; j++) {
                builder.append("[");
                builder.append(Arrays.toString(tracker[j]));
                builder.append("]");
            }
            builder.append("]");
        }
        builder.append("]");
        return builder.toString();
    }

}
