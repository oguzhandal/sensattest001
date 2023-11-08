package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class UpsertNotificationPermissionUserPayload{
	private boolean sendSms;
	private boolean sendMail;
	private String notificationPermissionId;
}