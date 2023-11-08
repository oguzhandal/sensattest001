package org.sensat.test.response.advertisement.getIsVehicleAdvertisementById;

import lombok.Data;

@Data
public class GetIsVehicleAdvertisementByIdResponse{
	private org.sensat.test.response.advertisement.getIsVehicleAdvertisementById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
