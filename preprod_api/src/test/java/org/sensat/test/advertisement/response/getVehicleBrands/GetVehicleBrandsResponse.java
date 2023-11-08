package org.sensat.test.advertisement.response.getVehicleBrands;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleBrandsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
