package org.sensat.test.user.response.changeAccount;

import lombok.Data;

@Data
public class ChangeAccountResponse{
	private org.sensat.test.user.response.changeAccount.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
