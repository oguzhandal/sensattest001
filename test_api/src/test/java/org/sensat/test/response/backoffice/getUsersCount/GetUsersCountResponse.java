package org.sensat.test.response.backoffice.getUsersCount;

import lombok.Data;

@Data
public class GetUsersCountResponse{
	private org.sensat.test.response.backoffice.getUsersCount.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
