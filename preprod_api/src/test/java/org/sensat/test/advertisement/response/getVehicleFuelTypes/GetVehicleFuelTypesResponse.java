package org.sensat.test.advertisement.response.getVehicleFuelTypes;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleFuelTypesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
