package com.bagal.models;

import com.bagal.convertors.StringToIntegerConvertor;
import io.github.sskorol.data.Column;
import io.github.sskorol.data.Sheet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Sheet(name = "amazonsearch")
public class TestData {

    @Column(name = "testcase")
    String testcase;

    @Column(name = "browser")
    String browser;

    @Column(name = "searchtext")
    String searchText;

    @Column(name = "category")
    String category;

    @Column(name = "resultcount",converter = StringToIntegerConvertor.class)
    int resultCount;

}
