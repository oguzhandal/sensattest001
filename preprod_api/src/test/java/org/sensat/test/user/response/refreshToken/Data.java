package org.sensat.test.user.response.refreshToken;

@lombok.Data
public class Data{
	private String accessTokenExpireDate;
	private int refreshTokenExpiresIn;
	private int accessTokenExpiresIn;
	private String createdTime;
	private String refreshTokenExpireDate;
	private String accessToken;
	private String tokenType;
	private String refreshToken;
}
