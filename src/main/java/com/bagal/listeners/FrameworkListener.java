package com.bagal.listeners;

import com.bagal.report.ExtentLogger;
import com.bagal.report.ExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class FrameworkListener implements ITestListener, ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
       ExtentReport.flushReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
       ExtentReport.createTest(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+ " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+ " is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+ " is skipped");
    }
}
