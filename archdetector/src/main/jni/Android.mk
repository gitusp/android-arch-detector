LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := NEON_DETECTOR

LOCAL_SRC_FILES := neonDetector.c

LOCAL_CFLAGS := -DHAVE_NEON=1
LOCAL_STATIC_LIBRARIES := cpufeatures

LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
$(call import-module,cpufeatures)

