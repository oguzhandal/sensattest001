package org.sensat.test.request.notification;

import lombok.Data;

@Data
public class NotificationsRequest{
	private boolean displayAll;
	private int pageSize;
	private boolean onlyUnRead;
	private int page;
}