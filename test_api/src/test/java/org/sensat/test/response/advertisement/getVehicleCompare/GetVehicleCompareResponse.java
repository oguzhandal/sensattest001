package org.sensat.test.response.advertisement.getVehicleCompare;

import lombok.Data;

@Data
public class GetVehicleCompareResponse{
	private org.sensat.test.response.advertisement.getVehicleCompare.Data data;
	private boolean success;
	private Object responseMessage;
	private int responseCode;
}
