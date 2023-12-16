package com.bagal.tests.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {
    @BeforeMethod
    public void setup(Object [] testData){
        Map<String,String> data = (Map)testData[0];
        System.out.print("username = " + data.get("username"));
        System.out.print("  password = " + data.get("password"));
        System.out.println("  browser = " + data.get("browser"));
    }

    @Test(dataProvider = "getData")
    public void demoTest(Map<String,String> data){
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
    }
}
