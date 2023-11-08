package org.sensat.test.message.response.updateUserShadowConversations;

import lombok.Data;

@Data
public class UpdateUserShadowConversationsResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}