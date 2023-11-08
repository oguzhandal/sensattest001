package org.sensat.test.response.advertisement.getVehicleGearTypes;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleBodyGearTypesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
