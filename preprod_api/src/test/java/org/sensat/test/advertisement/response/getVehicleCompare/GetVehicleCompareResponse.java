package org.sensat.test.advertisement.response.getVehicleCompare;

import lombok.Data;

@Data
public class GetVehicleCompareResponse{
	private org.sensat.test.advertisement.response.getVehicleCompare.Data data;
	private boolean success;
	private Object responseMessage;
	private int responseCode;
}
