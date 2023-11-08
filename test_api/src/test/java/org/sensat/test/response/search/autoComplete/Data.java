package org.sensat.test.response.search.autoComplete;

import java.util.List;

@lombok.Data
public class Data{
	private List<AdvertsItem> adverts;
	private List<Object> stores;
	private String searchedText;
}
