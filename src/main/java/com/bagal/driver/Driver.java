package com.bagal.driver;

import com.bagal.factories.DriverFactory;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(String browser){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver(browser));
        }

    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
