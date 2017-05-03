#include "com_ndkreport_NdkJniUtils.h"
#include <string.h>
#include <stdio.h>
JNIEXPORT jstring JNICALL Java_com_ndkreport_NdkJniUtils_getCLanguageString
        (JNIEnv *env, jobject object){
    return (*env)->NewStringUTF(env,"你好，Java!");
}

/*
 * Class:     com_ndkreport_NdkJniUtils
 * Method:    setCLanguageString
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_ndkreport_NdkJniUtils_setCLanguageString
        (JNIEnv *env, jobject object, jstring string) {
    const char *ch;
    //获取由java传过来的字符串
    ch = (*env)->GetStringUTFChars(env, string, NULL);
    strcat(ch,"c传出去的句子");
    return (*env)->NewStringUTF(env,ch);
}