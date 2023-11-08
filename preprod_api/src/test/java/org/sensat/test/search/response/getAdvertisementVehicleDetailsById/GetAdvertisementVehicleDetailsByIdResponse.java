package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import lombok.Data;

@Data
public class GetAdvertisementVehicleDetailsByIdResponse{
	private org.sensat.test.search.response.getAdvertisementVehicleDetailsById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
