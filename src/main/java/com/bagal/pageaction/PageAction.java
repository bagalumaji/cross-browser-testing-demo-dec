package com.bagal.pageaction;

import com.bagal.driver.DriverManager;
import com.bagal.factories.WaitFactory;
import org.openqa.selenium.By;

public final class PageAction {
    private PageAction() {
    }


    public static void waitForElementAndClick(By locator) {
        WaitFactory.waitForElementToBeClickable(locator).click();
    }

    public static void waitForElementAndType(By locator, String message) {
        WaitFactory.waitForElementToVisible(locator).sendKeys(message);
    }

    public static String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
