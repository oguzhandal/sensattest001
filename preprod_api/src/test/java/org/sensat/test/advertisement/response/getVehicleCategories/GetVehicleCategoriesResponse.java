package org.sensat.test.advertisement.response.getVehicleCategories;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleCategoriesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
