package org.sensat.test.response.user.GetUserMailDetailsForAdvertisement;

import java.util.List;
import lombok.Data;

@Data
public class PermissionsUser{
	private List<NotificationListItem> notificationList;
	private Object description;
	private String title;
}