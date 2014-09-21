package de.yadrone.base.navdata;

public class HDVideoStreamData extends NavData {
    private final HDVideoState hdvideo_state;
    private final int storage_fifo_nb_packets;
    private final int storage_fifo_size;
    private final int usbkey_size;
    private final int usbkey_freespace;
    private final int frame_number;
    private final int usbkey_remaining_time;

    public HDVideoStreamData(final HDVideoState hdvideo_state, final int storage_fifo_nb_packets,
            final int storage_fifo_size, final int usbkey_size, final int usbkey_freespace, final int frame_number,
            final int usbkey_remaining_time) {
        super();
        this.hdvideo_state = hdvideo_state;
        this.storage_fifo_nb_packets = storage_fifo_nb_packets;
        this.storage_fifo_size = storage_fifo_size;
        this.usbkey_size = usbkey_size;
        this.usbkey_freespace = usbkey_freespace;
        this.frame_number = frame_number;
        this.usbkey_remaining_time = usbkey_remaining_time;
    }

    /**
     * @return the hdvideo_state
     */
    public HDVideoState getHdvideo_state() {
        return hdvideo_state;
    }

    /**
     * @return the storage_fifo_nb_packets
     */
    public int getStorageFifoNbPackets() {
        return storage_fifo_nb_packets;
    }

    /**
     * @return the storage_fifo_size
     */
    public int getStorageFifoSize() {
        return storage_fifo_size;
    }

    /**
     * @return the usbkey_size
     */
    public int getUsbkeySize() {
        return usbkey_size;
    }

    /**
     * @return the usbkey_freespace
     */
    public int getUsbkeyFreespace() {
        return usbkey_freespace;
    }

    /**
     * @return the frame_number
     */
    public int getFrameNumber() {
        return frame_number;
    }

    /**
     * @return the usbkey_remaining_time
     */
    public int getUsbkeyRemainingTime() {
        return usbkey_remaining_time;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("HDVideoStreamData [hdvideo_state=");
        builder.append(hdvideo_state);
        builder.append(", storage_fifo_nb_packets=");
        builder.append(storage_fifo_nb_packets);
        builder.append(", storage_fifo_size=");
        builder.append(storage_fifo_size);
        builder.append(", usbkey_size=");
        builder.append(usbkey_size);
        builder.append(", usbkey_freespace=");
        builder.append(usbkey_freespace);
        builder.append(", frame_number=");
        builder.append(frame_number);
        builder.append(", usbkey_remaining_time=");
        builder.append(usbkey_remaining_time);
        builder.append("]");
        return builder.toString();
    }

}
