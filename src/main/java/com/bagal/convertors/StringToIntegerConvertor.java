package com.bagal.convertors;

import io.github.sskorol.converters.DefaultConverter;

public class StringToIntegerConvertor extends DefaultConverter<Integer> {

    @Override
    public Integer convert(String s) {
        return Integer.parseInt(s);
    }
}
