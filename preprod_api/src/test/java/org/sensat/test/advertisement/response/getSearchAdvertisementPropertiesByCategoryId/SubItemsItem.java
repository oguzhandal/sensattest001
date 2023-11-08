package org.sensat.test.advertisement.response.getSearchAdvertisementPropertiesByCategoryId;

import lombok.Data;

@Data
public class SubItemsItem{
	private Object subItems;
	private String label;
	private String value;
	private String key;
	private int propertyObjectId;
}
