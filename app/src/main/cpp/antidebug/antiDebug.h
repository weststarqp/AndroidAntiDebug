
#ifndef _ANTIDEBUG_H_
#define _ANTIDEBUG_H_

#include <jni.h>

class AntiDebug{
public:
    AntiDebug();

    bool anti_debug(JNIEnv *env);

private:
    bool isPort23946Open();
    bool isDebugProcessExist();
};
#endif