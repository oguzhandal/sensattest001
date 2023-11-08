package org.sensat.test.response.notification.notifications;

import lombok.Data;

@Data
public class DataItem{
	private String createdDate;
	private boolean isRead;
	private String description;
	private int id;
	private int type;
	private String content;
}