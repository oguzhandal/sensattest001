package org.sensat.test.response.advertisement;

import lombok.Data;

@Data
public class UpdateAdvertisementStatusResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
