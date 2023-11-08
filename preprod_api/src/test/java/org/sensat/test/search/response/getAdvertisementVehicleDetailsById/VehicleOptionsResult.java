package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class VehicleOptionsResult{
	private String title;
	private List<Object> items;
}