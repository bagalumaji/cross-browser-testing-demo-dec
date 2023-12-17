package com.bagal.pageaction;

import com.bagal.driver.DriverManager;
import com.bagal.factories.WaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public final class PageAction {
    private PageAction() {
    }


    public static void click(By locator) {
        WaitFactory.waitForElementToBeClickable(locator).click();
    }

    public static void type(By locator, String message) {
        WaitFactory.waitForElementToVisible(locator).sendKeys(message);
    }

    public static String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
    public static boolean isDisplayed(By locator){
        try {
            return WaitFactory.waitForElementToVisible(locator).isDisplayed();
        }catch (TimeoutException e){
            return false;
        }
    }

}
