package ro.tsuku.androidarchdetector;

/**
 * Created by usp on 5/22/15.
 */
public class NeonDetector {
    static {
        System.loadLibrary("NEON_DETECTOR");
    }

    public static native boolean hasNeon();
}
