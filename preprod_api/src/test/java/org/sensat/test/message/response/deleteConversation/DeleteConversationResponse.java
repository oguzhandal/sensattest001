package org.sensat.test.message.response.deleteConversation;

import lombok.Data;

@Data
public class DeleteConversationResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}