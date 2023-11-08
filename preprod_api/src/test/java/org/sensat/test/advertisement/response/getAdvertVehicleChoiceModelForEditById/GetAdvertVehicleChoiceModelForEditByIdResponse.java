package org.sensat.test.advertisement.response.getAdvertVehicleChoiceModelForEditById;

import lombok.Data;

@Data
public class GetAdvertVehicleChoiceModelForEditByIdResponse{
	private org.sensat.test.advertisement.response.getAdvertVehicleChoiceModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
