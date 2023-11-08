package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class PasswordRecoveryPayload{
	private String captchaToken;
	private String email;
}