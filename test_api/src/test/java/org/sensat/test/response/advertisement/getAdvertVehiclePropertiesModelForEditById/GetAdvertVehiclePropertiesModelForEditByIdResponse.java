package org.sensat.test.response.advertisement.getAdvertVehiclePropertiesModelForEditById;

import lombok.Data;

@Data
public class GetAdvertVehiclePropertiesModelForEditByIdResponse {
	private org.sensat.test.response.advertisement.getAdvertVehiclePropertiesModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
