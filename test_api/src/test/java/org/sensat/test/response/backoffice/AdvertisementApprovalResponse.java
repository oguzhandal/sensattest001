package org.sensat.test.response.backoffice;

import lombok.Data;

@Data
public class AdvertisementApprovalResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
