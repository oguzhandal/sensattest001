package org.sensat.test.advertisement.response.getUserPendingAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserPendingAdvertisementsByUserIdResponse{
	private org.sensat.test.advertisement.response.getUserPendingAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
