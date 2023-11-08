package org.sensat.test.advertisement.response.getUserUnpublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserUnpublishedAdvertisementsByUserIdResponse{
	private org.sensat.test.advertisement.response.getUserUnpublishedAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
