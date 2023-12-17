package com.bagal.testbase;

import com.bagal.driver.Driver;
import com.bagal.models.TestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod(alwaysRun = true)
    public void setup(Object [] data){
        TestData testData = (TestData) data[0];
        Driver.initDriver(testData.getBrowser());
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        Driver.quitDriver();
    }
}
