package org.sensat.test.advertisement.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class AccordionItemsItem{
	private List<ListItemsItem> listItems;
	private String icon;
	private String header;
	private int key;
}
