package com.bagal.report;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public final class ExtentManager {
    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> EXTENT_TEST = new ThreadLocal<>();

    public static void setExtentTest(ExtentTest test){
        if(Objects.nonNull(test)){
            EXTENT_TEST.set(test);
        }
    }
    public static ExtentTest getExtentTest(){
        return  EXTENT_TEST.get();
    }
    public static void unload(){
        EXTENT_TEST.remove();
    }
}
