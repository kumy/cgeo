package cgeo.geocaching.network;

public class DownloadProgress {

    public static final int MSG_DONE = -1;
    public static final int MSG_SERVER_FAIL = -2;
    public static final int MSG_NO_REGISTRATION = -3;
    public static final int MSG_WAITING = 0;
    public static final int MSG_LOADING = 1;
    public static final int MSG_LOADED = 2;

    private DownloadProgress() {
        // Do not instantiate
    }
}
