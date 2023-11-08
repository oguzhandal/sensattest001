package org.sensat.test.response.advertisement.getAdvertisementById;

import java.util.List;
import lombok.Data;

@Data
public class VehicleOptionsResult{
	private String title;
	private List<Object> items;
}
