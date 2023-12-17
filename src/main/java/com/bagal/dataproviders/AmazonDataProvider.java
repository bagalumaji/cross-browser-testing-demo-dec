package com.bagal.dataproviders;

import com.bagal.models.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

import static io.github.sskorol.data.TestDataReader.use;

public class AmazonDataProvider {
    @DataSupplier(name = "getAmazonSearchData")
    public StreamEx<TestData> getAmazonSearchData(Method method) {
        return use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testdata -> testdata.getTestcase().equalsIgnoreCase(method.getName()));
    }
}
