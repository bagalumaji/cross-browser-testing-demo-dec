package com.bagal.factories;

import com.bagal.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactory {
    public static WebElement waitForElementToBeClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }
    private static WebDriverWait getWait(){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
    }

    public static WebElement waitForElementToVisible(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
