#include "com_ndkreport_NdkJniUtils.h"

JNIEXPORT jstring JNICALL Java_com_ndkreport_NdkJniUtils_getCLanguageString
        (JNIEnv *env, jobject j){
    return (*env)->NewStringUTF(env,"5959!");
}