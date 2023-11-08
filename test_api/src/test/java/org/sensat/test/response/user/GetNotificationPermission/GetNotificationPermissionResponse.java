package org.sensat.test.response.user.GetNotificationPermission;

import lombok.Data;

@Data
public class GetNotificationPermissionResponse{
	private org.sensat.test.response.user.GetNotificationPermission.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}