package com.bagal.pages;

import com.bagal.pageaction.PageAction;
import org.openqa.selenium.By;

import static com.bagal.pageaction.PageAction.click;
import static com.bagal.pageaction.PageAction.type;

public class HomePage extends BasePage{
    private static final By SEARCH_TEXT_BOX = By.id("twotabsearchtextbox");
    private static final  By SEARCH_BUTTON =By.id("nav-search-submit-button");
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
}
