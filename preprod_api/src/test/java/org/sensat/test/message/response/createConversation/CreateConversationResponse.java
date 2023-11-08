package org.sensat.test.message.response.createConversation;


import lombok.Data;

@Data
public class CreateConversationResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}