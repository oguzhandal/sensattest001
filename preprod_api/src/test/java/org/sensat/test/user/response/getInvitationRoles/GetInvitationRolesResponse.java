package org.sensat.test.user.response.getInvitationRoles;

import java.util.List;
import lombok.Data;

@Data
public class GetInvitationRolesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}