package com.ndkreport;

public class NdkJniUtils {

    static {
        System.loadLibrary("MyTestJniLib");   //defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();

}