package org.sensat.test.response.search.getShowcaseAdvertisements;

import java.util.List;

@lombok.Data
public class Data{
	private String title;
	private List<ItemsItem> items;
	private String allVehiclesPath;
}
