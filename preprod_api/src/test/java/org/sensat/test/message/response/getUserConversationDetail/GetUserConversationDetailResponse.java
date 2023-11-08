package org.sensat.test.message.response.getUserConversationDetail;

import lombok.Data;

@Data
public class GetUserConversationDetailResponse{
	private org.sensat.test.message.response.getUserConversationDetail.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}