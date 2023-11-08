package org.sensat.test.notification.response.notifications;

import lombok.Data;

@Data
public class NotificationListItem{
	private Button button;
	private String path;
	private String createdDate;
	private boolean isRead;
	private String description;
	private int id;
	private int type;
	private String content;
}