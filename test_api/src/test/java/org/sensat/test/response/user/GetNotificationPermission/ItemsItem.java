package org.sensat.test.response.user.GetNotificationPermission;

import lombok.Data;

@Data
public class ItemsItem{
	private boolean hasSMSPermission;
	private String label;
	private String key;
	private boolean hasEmailPermission;
}