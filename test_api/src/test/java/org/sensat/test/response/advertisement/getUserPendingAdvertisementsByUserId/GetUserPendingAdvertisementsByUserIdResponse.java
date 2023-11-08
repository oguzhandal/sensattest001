package org.sensat.test.response.advertisement.getUserPendingAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserPendingAdvertisementsByUserIdResponse{
	private org.sensat.test.response.advertisement.getUserPendingAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}