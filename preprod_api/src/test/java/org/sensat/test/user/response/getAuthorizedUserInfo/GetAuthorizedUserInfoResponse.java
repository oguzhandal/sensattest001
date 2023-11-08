package org.sensat.test.user.response.getAuthorizedUserInfo;

import lombok.Data;

@Data
public class GetAuthorizedUserInfoResponse{
	private org.sensat.test.user.response.getAuthorizedUserInfo.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
