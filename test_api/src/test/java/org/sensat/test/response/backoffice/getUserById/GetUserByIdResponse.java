package org.sensat.test.response.backoffice.getUserById;

import lombok.Data;

@Data
public class GetUserByIdResponse{
	private org.sensat.test.response.backoffice.getUserById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
