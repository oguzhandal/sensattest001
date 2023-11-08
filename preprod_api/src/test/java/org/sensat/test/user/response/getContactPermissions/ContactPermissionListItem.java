package org.sensat.test.user.response.getContactPermissions;

import lombok.Data;

@Data
public class ContactPermissionListItem{
	private String label;
	private boolean value;
	private String key;
}