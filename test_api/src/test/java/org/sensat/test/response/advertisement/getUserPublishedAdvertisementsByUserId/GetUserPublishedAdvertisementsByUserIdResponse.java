package org.sensat.test.response.advertisement.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserPublishedAdvertisementsByUserIdResponse{
	private org.sensat.test.response.advertisement.getUserPublishedAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}