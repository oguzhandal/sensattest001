package org.sensat.test.response.advertisement.getVehicleBrands;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleBrandsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
