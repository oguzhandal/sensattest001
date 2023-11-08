package org.sensat.test.response.notification;

import lombok.Data;

@Data
public class CreateNotificationResponse {
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}