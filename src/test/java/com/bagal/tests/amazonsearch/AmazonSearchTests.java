package com.bagal.tests.amazonsearch;

import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

public class AmazonSearchTests extends TestBase {
    @Test
    public void validSearchTest(){
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
