package org.sensat.test.response.advertisement.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class OtherSpecsItem{
	private List<SpecsItem> specs;
	private String title;
}
