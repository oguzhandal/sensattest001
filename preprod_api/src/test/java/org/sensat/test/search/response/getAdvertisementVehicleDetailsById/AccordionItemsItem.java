package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class AccordionItemsItem{
	private List<ListItemsItem> listItems;
	private String icon;
	private String header;
	private int key;
}