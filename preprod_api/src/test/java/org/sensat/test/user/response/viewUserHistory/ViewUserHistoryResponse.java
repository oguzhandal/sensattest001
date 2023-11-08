package org.sensat.test.user.response.viewUserHistory;

import lombok.Data;

@Data
public class ViewUserHistoryResponse{
	private org.sensat.test.user.response.viewUserHistory.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
