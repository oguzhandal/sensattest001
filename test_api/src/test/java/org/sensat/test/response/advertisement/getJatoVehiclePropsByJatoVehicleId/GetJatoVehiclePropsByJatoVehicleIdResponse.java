package org.sensat.test.response.advertisement.getJatoVehiclePropsByJatoVehicleId;

import lombok.Data;

@Data
public class GetJatoVehiclePropsByJatoVehicleIdResponse{
	private org.sensat.test.response.advertisement.getJatoVehiclePropsByJatoVehicleId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
