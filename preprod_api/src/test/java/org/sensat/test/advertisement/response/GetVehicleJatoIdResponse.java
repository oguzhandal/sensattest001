package org.sensat.test.advertisement.response;

import lombok.Data;

@Data
public class GetVehicleJatoIdResponse{
	private long data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
