package org.sensat.test.user.response.getNotificationPermission;

import java.util.List;

@lombok.Data
public class Data{
	private List<NotificationListItem> notificationList;
	private Object description;
	private String title;
}
