package com.bagal.tests.amazonsearch;

import com.bagal.dataproviders.AmazonDataProvider;
import com.bagal.models.TestData;
import com.bagal.pages.HomePage;
import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class AmazonSearchTests extends TestBase {
    @Test(dataProvider = "getAmazonSearchData", dataProviderClass = AmazonDataProvider.class,description = "amazon search test")
    public void amazonSearchTest(TestData testData) {
        HomePage homePage = new HomePage();
        assertTrue(homePage.isPageLoaded());
        boolean displayedProductCategory = homePage
                .typeTextInSearchTextBox(testData.getSearchText())
                .clickOnSearchButton()
                .isDisplayedProductCategory(testData.getCategory());
        assertTrue(displayedProductCategory);
        assertTrue(homePage.isDisplayedSearchResultWithExpectedCount(testData.getResultCount()));
    }
}
