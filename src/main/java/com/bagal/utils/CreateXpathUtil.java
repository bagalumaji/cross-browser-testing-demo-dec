package com.bagal.utils;

import org.openqa.selenium.By;

public final class CreateXpathUtil {
    private CreateXpathUtil(){}

    public static By getXpath(String xpath,String value){
        return By.xpath(String.format(xpath,value));
    }
}
