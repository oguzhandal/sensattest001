package org.sensat.test.response.user.LogoutUser;

import lombok.Data;

@Data
public class LogoutUserResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}