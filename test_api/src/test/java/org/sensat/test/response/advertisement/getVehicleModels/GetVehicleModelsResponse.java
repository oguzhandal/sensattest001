package org.sensat.test.response.advertisement.getVehicleModels;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleModelsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
