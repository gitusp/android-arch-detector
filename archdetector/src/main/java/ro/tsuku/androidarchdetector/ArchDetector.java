package ro.tsuku.androidarchdetector;

import android.os.Build;

/**
 * Created by usp on 5/22/15.
 */
public class ArchDetector {
    public static Arch detect() {
        if (Build.CPU_ABI.equals(Arch.X86.getValue())) {
            return Arch.X86;
        }
        if (Build.CPU_ABI.equals(Arch.ARM64_V8A.getValue())) {
            return Arch.ARM64_V8A;
        }
        if (Build.CPU_ABI.equals(Arch.ARMEABI_V7A.getValue())) {
            if (NeonDetector.hasNeon()) {
                return Arch.ARMEABI_V7A_NEON;
            }
            return Arch.ARMEABI_V7A;
        }

        return Arch.UNKNOWN;
    }

    /** Enums **/

    public enum Arch {
        UNKNOWN("unknown"),
        X86("x86"),
        ARMEABI_V7A("armeabi-v7a"),
        ARMEABI_V7A_NEON("armeabi-v7a-neon"),
        ARM64_V8A("arm64-v8a");

        private String value;

        Arch(String value) {
            this.value = value;
        }

        /** Accessors **/

        public String getValue() {
            return value;
        }
    }
}
