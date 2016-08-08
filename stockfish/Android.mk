LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
 
LOCAL_MODULE    := stockfish
LOCAL_C_INCLUDES := repo/src
 
LOCAL_CFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__ -std=c++11 
LOCAL_CPPFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__ -std=c++11 
LOCAL_LDLIBS := -lm -latomic
LOCAL_LDFLAGS += -Wl,--gc-sections
LOCAL_ARM_MODE  := arm
 
LOCAL_SRC_FILES := 	repo/src/benchmark.cpp\
                    	repo/src/bitbase.cpp\
                   	repo/src/bitboard.cpp\
                   	repo/src/endgame.cpp\
                   	repo/src/evaluate.cpp\
                   	repo/src/main.cpp\
                   	repo/src/material.cpp\
                   	repo/src/misc.cpp\
                   	repo/src/movegen.cpp\
                   	repo/src/movepick.cpp\
                   	repo/src/pawns.cpp\
                   	repo/src/position.cpp\
                   	repo/src/psqt.cpp\
                   	repo/src/search.cpp\
                   	repo/src/thread.cpp\
                   	repo/src/timeman.cpp\
                   	repo/src/tt.cpp\
                   	repo/src/uci.cpp\
                   	repo/src/ucioption.cpp\
                   	repo/src/syzygy/tbprobe.cpp
 
include $(BUILD_EXECUTABLE)
