package org.sensat.test.user.response.viewUserHistoryDetails;

import lombok.Data;

@Data
public class ViewUserHistoryDetailsResponse{
	private org.sensat.test.user.response.viewUserHistoryDetails.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
