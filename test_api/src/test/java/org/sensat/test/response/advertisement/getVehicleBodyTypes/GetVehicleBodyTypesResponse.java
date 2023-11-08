package org.sensat.test.response.advertisement.getVehicleBodyTypes;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleBodyTypesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
