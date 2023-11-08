package org.sensat.test.advertisement.response.getIsVehicleAdvertisementById;

import lombok.Data;

@Data
public class GetIsVehicleAdvertisementByIdResponse{
	private org.sensat.test.advertisement.response.getIsVehicleAdvertisementById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
