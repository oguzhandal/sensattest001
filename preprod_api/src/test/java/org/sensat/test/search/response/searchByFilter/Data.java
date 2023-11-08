package org.sensat.test.search.response.searchByFilter;

import java.util.List;

@lombok.Data
public class Data {
    private int total;
    private List<DataItem> data;
}
