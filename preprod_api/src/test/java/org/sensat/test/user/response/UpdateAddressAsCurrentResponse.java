package org.sensat.test.user.response;

import lombok.Data;

@Data
public class UpdateAddressAsCurrentResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
