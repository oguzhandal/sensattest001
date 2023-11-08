package org.sensat.test.user.response.getStoreWithDetails;

import lombok.Data;

@Data
public class GetStoreWithDetailsResponse{
	private org.sensat.test.user.response.getStoreWithDetails.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
