package com.ndkreport;

public class NdkJniUtils {

    String msg;

    static {
        System.loadLibrary("MyTestJniLib");   //defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();

    public native String setCLanguageString(String str);

}