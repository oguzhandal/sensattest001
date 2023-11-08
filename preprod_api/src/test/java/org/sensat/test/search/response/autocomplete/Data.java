package org.sensat.test.search.response.autocomplete;

import java.util.List;

@lombok.Data
public class Data {
    private List<AdvertsItem> adverts;
    private List<Object> stores;
    private String searchedText;
}
