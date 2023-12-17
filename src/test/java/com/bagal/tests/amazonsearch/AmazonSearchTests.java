package com.bagal.tests.amazonsearch;

import com.bagal.dataproviders.AmazonDataProvider;
import com.bagal.models.TestData;
import com.bagal.pageaction.PageAction;
import com.bagal.pages.HomePage;
import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AmazonSearchTests extends TestBase {
    @Test(dataProvider = "getAmazonSearchData", dataProviderClass = AmazonDataProvider.class)
    public void amazonSearchTest1(TestData testData) {
        System.out.println("PageAction.getPageTitle() = " + PageAction.getPageTitle());
        System.out.println("testData = " + testData);
        HomePage homePage = new HomePage();
        assertTrue(homePage.isPageLoaded());
        homePage
                .typeTextInSearchTextBox(testData.getSearchText())
                .clickOnSearchButton();
    }
}
