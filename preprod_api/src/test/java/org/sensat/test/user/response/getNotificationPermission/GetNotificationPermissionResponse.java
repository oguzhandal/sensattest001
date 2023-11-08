package org.sensat.test.user.response.getNotificationPermission;

import lombok.Data;

@Data
public class GetNotificationPermissionResponse{
	private org.sensat.test.user.response.getNotificationPermission.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
