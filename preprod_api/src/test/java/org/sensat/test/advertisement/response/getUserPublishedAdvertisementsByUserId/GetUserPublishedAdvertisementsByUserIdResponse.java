package org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserPublishedAdvertisementsByUserIdResponse{
	private org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
