package com.bagal.tests.amazonsearch;

import com.bagal.models.TestData;
import com.bagal.testbase.TestBase;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static io.github.sskorol.data.TestDataReader.use;

public class AmazonSearchTests extends TestBase {
    @Test(dataProvider = "getData")
    public void amazonSearchTest1(TestData testData) {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test(dataProvider = "getData")
    public void amazonSearchTest2(TestData testData) {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test(dataProvider = "getData")
    public void amazonSearchTest3(TestData testData) {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @DataSupplier
    public StreamEx<TestData> getData(Method method) {
        return use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testdata -> testdata.getTestcase().equalsIgnoreCase(method.getName()));
    }
}
