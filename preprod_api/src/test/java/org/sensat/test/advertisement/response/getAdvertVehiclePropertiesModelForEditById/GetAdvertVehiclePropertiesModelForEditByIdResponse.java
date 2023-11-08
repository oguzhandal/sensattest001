package org.sensat.test.advertisement.response.getAdvertVehiclePropertiesModelForEditById;

import lombok.Data;

@Data
public class GetAdvertVehiclePropertiesModelForEditByIdResponse {
	private org.sensat.test.advertisement.response.getAdvertVehiclePropertiesModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
