package com.bagal.pages;

import com.bagal.constants.HomePageConstants;
import com.bagal.factories.WaitFactory;
import com.bagal.pageaction.PageAction;
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
        return this;
    }
    public HomePage clickOnSearchButton(){
        click(SEARCH_BUTTON);
        return this;
    }
    public boolean isDisplayedProductCategory(String productCategory){
        return isDisplayed(CreateXpathUtil.getXpath(HomePageConstants.getXpathProductCategory(),productCategory));
    }
    public boolean isDisplayedSearchResultWithExpectedCount(int count){
        return WaitFactory.waitForVisibilityOfAllElements(SEARCH_RESULT).size()>count;
    }
}
