package com.bagal.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTest {
    @BeforeMethod(alwaysRun = true)
    public void setup(Object [] testData){
        /*System.out.print("username = " + testData[0]);
        System.out.print("  password = " + testData[1]);
        System.out.println("  browser = " + testData[2]);*/
        Map<String,String> data = (Map)testData[0];
        System.out.print("username = " + data.get("username"));
        System.out.print("  password = " + data.get("password"));
        System.out.println("  browser = " + data.get("browser"));
    }

    @Test(dataProvider = "getData")
    public void demoTest(Map<String,String> data){
        /*WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.quit();*/
        System.out.print("username = " + data.get("username"));
        System.out.print("  password = " + data.get("password"));
        System.out.println("  browser = " + data.get("browser"));
    }
    @DataProvider
    public Object[] getData(){
       Map<String,String> map = new HashMap<>();
        map.put("username","username-1");
        map.put("password","password-1");
        map.put("browser","chrome");

        Map<String,String> map2 = new HashMap<>();
        map2.put("username","username-2");
        map2.put("password","password-2");
        map2.put("browser","edge");

        Map<String,String> map3 = new HashMap<>();
        map3.put("username","username-3");
        map3.put("password","password-3");
        map3.put("browser","firefox");

        return new Object[]{map,map2,map3};
        /*return new Object[][]{
                {"username-1","password-1","chrome"},
                {"username-2","password-1","firefox"},
                {"username-3","password-3","edge"}
        };*/
    }
}
