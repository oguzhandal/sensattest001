package org.sensat.test.response.user.GetInvitationRoles;

import java.util.List;
import lombok.Data;

@Data
public class GetInvitationRolesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}