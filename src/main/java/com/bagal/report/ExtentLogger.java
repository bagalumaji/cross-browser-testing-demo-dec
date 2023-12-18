package com.bagal.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.bagal.utils.ScreenshotUtil;

public final class ExtentLogger {
    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message);
    }
    public static void fail(String message){
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshotAsBase64String()).build());
    }

    public static void skip(String message){
        ExtentManager.getExtentTest().skip(message);

    }
    public static void info(String message){
        ExtentManager.getExtentTest().info(message);

    }
}
