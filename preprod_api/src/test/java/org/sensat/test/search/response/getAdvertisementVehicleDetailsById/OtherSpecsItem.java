package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class OtherSpecsItem{
	private List<SpecsItem> specs;
	private String title;
}