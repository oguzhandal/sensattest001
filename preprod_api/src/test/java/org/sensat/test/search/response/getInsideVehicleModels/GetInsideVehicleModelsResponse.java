package org.sensat.test.search.response.getInsideVehicleModels;

import java.util.List;
import lombok.Data;

@Data
public class GetInsideVehicleModelsResponse{
	private List<Object> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}