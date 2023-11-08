package org.sensat.test.advertisement.response;

import lombok.Data;

@Data
public class UpdateAdvertisementStatusResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
