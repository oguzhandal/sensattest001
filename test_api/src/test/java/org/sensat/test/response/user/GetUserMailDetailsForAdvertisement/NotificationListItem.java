package org.sensat.test.response.user.GetUserMailDetailsForAdvertisement;

import java.util.List;
import lombok.Data;

@Data
public class NotificationListItem{
	private String title;
	private List<ItemsItem> items;
}