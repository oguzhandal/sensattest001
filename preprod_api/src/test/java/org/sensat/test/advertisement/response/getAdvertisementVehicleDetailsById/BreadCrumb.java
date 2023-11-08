package org.sensat.test.advertisement.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class BreadCrumb{
	private String advertNo;
	private List<ItemsItem> items;
}
