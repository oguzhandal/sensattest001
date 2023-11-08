package org.sensat.test.advertisement.response.getAdvertisementVehicleDetailsById;

import lombok.Data;

import java.io.Serializable;

@Data
public class GetAdvertisementVehicleDetailsByIdResponse implements Serializable {
	private VehicleData data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
