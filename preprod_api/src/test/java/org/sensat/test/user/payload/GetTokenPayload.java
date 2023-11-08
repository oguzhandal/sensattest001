package org.sensat.test.user.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetTokenPayload{
	private int channelCode;
	private String email;
	private String password;
	private String grantType;
}
