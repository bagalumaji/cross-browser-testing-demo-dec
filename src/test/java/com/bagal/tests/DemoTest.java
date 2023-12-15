package com.bagal.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTest {
    @Test
    public void demoTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.quit();
    }
}
