package org.sensat.test.backoffice.response.getUserById;

import lombok.Data;

@Data
public class GetUserByIdResponse{
	private org.sensat.test.backoffice.response.getUserById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
