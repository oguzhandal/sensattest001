package org.sensat.test.notification.response.notifications;

import lombok.Data;

@Data
public class NotificationsResponse{
	private org.sensat.test.notification.response.notifications.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}