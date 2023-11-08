package org.sensat.test.user.response.refreshToken;

import lombok.Data;

@Data
public class RefreshTokenResponse{
	private org.sensat.test.user.response.refreshToken.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
