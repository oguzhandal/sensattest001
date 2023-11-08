package org.sensat.test.response.advertisement.getSearchAdvertisementPropertiesByCategoryId;

import java.util.List;
import lombok.Data;

@Data
public class ItemsItem{
	private List<SubItemsItem> subItems;
	private String label;
	private String value;
	private String key;
	private int propertyObjectId;
}
