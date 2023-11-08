package org.sensat.test.response.advertisement;

import lombok.Data;

@Data
public class GetVehicleJatoIdResponse{
	private long data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
