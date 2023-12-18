package com.bagal.pages;

import com.bagal.constants.HomePageConstants;
import com.bagal.factories.WaitFactory;
import com.bagal.pageaction.PageAction;
import com.bagal.report.ExtentLogger;
import com.bagal.utils.CreateXpathUtil;
import org.openqa.selenium.By;

import static com.bagal.pageaction.PageAction.*;

public class HomePage extends BasePage{
    private static final By SEARCH_TEXT_BOX = By.id("twotabsearchtextbox");
    private static final  By SEARCH_BUTTON =By.id("nav-search-submit-button");

    private static final By SEARCH_RESULT =By.xpath("//div[@data-component-type='s-search-result']");
    @Override
    public boolean isPageLoaded() {
        return PageAction.isDisplayed(SEARCH_TEXT_BOX);
    }
    public HomePage typeTextInSearchTextBox(String searchText){
        type(SEARCH_TEXT_BOX,searchText);
        ExtentLogger.info("entered text into search box as : "+searchText);
        return this;
    }
    public HomePage clickOnSearchButton(){
        click(SEARCH_BUTTON);
        ExtentLogger.info("clicked on search button");
        return this;
    }
    public boolean isDisplayedProductCategory(String productCategory){
        ExtentLogger.info("checking for : "+productCategory+ " is displayed or not");
        return isDisplayed(CreateXpathUtil.getXpath(HomePageConstants.getXpathProductCategory(),productCategory));
    }
    public boolean isDisplayedSearchResultWithExpectedCount(int count){
        ExtentLogger.info("checking for search result count is displayed or not");
        return WaitFactory.waitForVisibilityOfAllElements(SEARCH_RESULT).size()>count;
    }
}
