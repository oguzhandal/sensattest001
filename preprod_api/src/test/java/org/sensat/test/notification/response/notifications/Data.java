package org.sensat.test.notification.response.notifications;

import java.util.List;

@lombok.Data
public class Data{
	private List<NotificationListItem> notificationList;
	private int totalCount;
}