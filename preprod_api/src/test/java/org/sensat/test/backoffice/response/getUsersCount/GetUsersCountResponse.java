package org.sensat.test.backoffice.response.getUsersCount;

import lombok.Data;

@Data
public class GetUsersCountResponse{
	private org.sensat.test.backoffice.response.getUsersCount.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
