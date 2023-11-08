package org.sensat.test.notification.response.create;

import lombok.Data;

@Data
public class CreateResponse {
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}