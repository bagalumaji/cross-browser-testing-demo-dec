package com.bagal.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Objects;

public final class ExtentReport {
private static ExtentReports extentReports;
    private ExtentReport() {
    }

    public static void initReport() {
        extentReports = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("target/report/index.html");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Amazon Search Test Report");
        extentSparkReporter.config().setDocumentTitle("Cross Browser Test");
        extentReports.attachReporter(extentSparkReporter);
    }

    public static void createTest(String testCaseName) {
        ExtentManager.setExtentTest(extentReports.createTest(testCaseName));
    }

    public static void flushReport() {
        if(Objects.nonNull(extentReports)){
            extentReports.flush();
            ExtentManager.unload();
        }
    }
}
