package org.sensat.test.user.response.getNotificationPermission;

import lombok.Data;

@Data
public class ItemsItem{
	private boolean hasSMSPermission;
	private String label;
	private String key;
	private boolean hasEmailPermission;
}