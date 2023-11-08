package org.sensat.test.advertisement.response.getVehicleModelTypes;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleModelTypesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
