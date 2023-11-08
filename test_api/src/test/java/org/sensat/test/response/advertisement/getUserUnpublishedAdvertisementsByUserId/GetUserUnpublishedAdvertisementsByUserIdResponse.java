package org.sensat.test.response.advertisement.getUserUnpublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserUnpublishedAdvertisementsByUserIdResponse{
	private org.sensat.test.response.advertisement.getUserUnpublishedAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}