#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <cpu-features.h>

jboolean
Java_ro_tsuku_androidarchdetector_NeonDetector_hasNeon(JNIEnv* env, jobject obj)
{
    if (android_getCpuFamily() != ANDROID_CPU_FAMILY_ARM) {
        return JNI_FALSE;
    }

    uint64_t cpuFeatures = android_getCpuFeatures();
    if ((cpuFeatures & ANDROID_CPU_ARM_FEATURE_ARMv7) == 0) {
        return JNI_FALSE;
    }
    if ((cpuFeatures & ANDROID_CPU_ARM_FEATURE_NEON) == 0) {
        return JNI_FALSE;
    }

    return JNI_TRUE;
}

