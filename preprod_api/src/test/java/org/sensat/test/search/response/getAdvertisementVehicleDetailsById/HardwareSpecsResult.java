package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class HardwareSpecsResult{
	private List<AccordionItemsItem> accordionItems;
	private String title;
}