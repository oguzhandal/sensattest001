package org.sensat.test.user.response.getNotificationPermission;

import java.util.List;
import lombok.Data;

@Data
public class NotificationListItem{
	private String title;
	private List<ItemsItem> items;
}