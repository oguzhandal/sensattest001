package org.sensat.test.notification.response.getUserNotificationTypes;

import java.util.List;
import lombok.Data;

@Data
public class GetUserNotificationTypesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}