package com.bagal.tests.amazonsearch;

import com.bagal.dataproviders.AmazonDataProvider;
import com.bagal.driver.DriverManager;
import com.bagal.models.TestData;
import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

public class AmazonSearchTests extends TestBase {
    @Test(dataProvider = "getAmazonSearchData",dataProviderClass = AmazonDataProvider.class)
    public void amazonSearchTest1(TestData testData) {
        System.out.println("driver.getTitle() = " + DriverManager.getDriver().getTitle());
        System.out.println("testData = " + testData);
    }
    @Test(dataProvider = "getAmazonSearchData",dataProviderClass = AmazonDataProvider.class)
    public void amazonSearchTest2(TestData testData) {
        System.out.println("driver.getTitle() = " + DriverManager.getDriver().getTitle());
        System.out.println("testData = " + testData);
    }
    @Test(dataProvider = "getAmazonSearchData",dataProviderClass = AmazonDataProvider.class)
    public void amazonSearchTest3(TestData testData) {
        System.out.println("driver.getTitle() = " + DriverManager.getDriver().getTitle());
        System.out.println("testData = " + testData);
    }
}
