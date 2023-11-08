package org.sensat.test.advertisement.response.getVehicleDetailsPropertiesForCreateAdvertisementQuery;

import java.util.List;
import lombok.Data;

@Data
public class GeneralHardwarePropertiesItem{
	private List<DefaultSelectedItemsItem> defaultSelectedItems;
	private int id;
	private String title;
	private List<ItemsItem> items;
	private String key;
}
