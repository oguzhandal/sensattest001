package org.sensat.test.request.notification;

import lombok.Data;

@Data
public class CreateNotificationRequest {
	private String description;
	private int type;
	private int userId;
	private String content;
}