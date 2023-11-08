package org.sensat.test.user.response.getContactPermissions;

import lombok.Data;

@Data
public class GetContactPermissionsResponse{
	private org.sensat.test.user.response.getContactPermissions.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
