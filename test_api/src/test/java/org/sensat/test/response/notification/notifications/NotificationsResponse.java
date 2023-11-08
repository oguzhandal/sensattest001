package org.sensat.test.response.notification.notifications;

import java.util.List;
import lombok.Data;

@Data
public class NotificationsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}