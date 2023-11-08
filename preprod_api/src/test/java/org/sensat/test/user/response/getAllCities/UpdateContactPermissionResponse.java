package org.sensat.test.user.response.getAllCities;

import lombok.Data;

@Data
public class UpdateContactPermissionResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}