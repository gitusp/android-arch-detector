package ro.tsuku.androidarchdetector;

/**
 * Created by usp on 5/22/15.
 */
class NeonDetector {
    static {
        System.loadLibrary("NEON_DETECTOR");
    }

    static native boolean hasNeon();
}
