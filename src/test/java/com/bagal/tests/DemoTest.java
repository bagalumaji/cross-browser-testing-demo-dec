package com.bagal.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTest {
    @Test(dataProvider = "getData")
    public void demoTest(String username,String password,String browser){
        /*WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.quit();*/
        System.out.print("username = " + username);
        System.out.print("  password = " + password);
        System.out.println("  browser = " + browser);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data={
                {"username-1","password-1","chrome"},
                {"username-2","password-1","firefox"},
                {"username-3","password-3","edge"}
        };
        return data;
    }
}
