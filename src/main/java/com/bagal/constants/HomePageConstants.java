package com.bagal.constants;

import lombok.Getter;

public final class HomePageConstants {
    private HomePageConstants(){}

    private @Getter final static String xpathProductCategory="//div[@id='departments']//following-sibling::ul//span[normalize-space(text())='%s']";
}
