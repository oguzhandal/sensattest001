package org.sensat.test.message.response.getUserConversations;

import java.util.List;
import lombok.Data;

@Data
public class GetUserConversationsResponse{
	private List<Object> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}