package org.sensat.test.user.response.getSelectedConsultantRoles;

import java.util.List;
import lombok.Data;

@Data
public class GetSelectedConsultantRolesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}