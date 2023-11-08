package org.sensat.test.response.advertisement.getAdvertVehicleChoiceModelForEditById;

import lombok.Data;

@Data
public class GetAdvertVehicleChoiceModelForEditByIdResponse{
	private org.sensat.test.response.advertisement.getAdvertVehicleChoiceModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
