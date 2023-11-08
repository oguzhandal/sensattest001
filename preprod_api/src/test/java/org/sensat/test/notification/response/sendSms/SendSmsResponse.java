package org.sensat.test.notification.response.sendSms;

import lombok.Data;

@Data
public class SendSmsResponse{
	private Object data;
	private boolean success;
	private Object responseMessage;
	private int responseCode;
}