package org.sensat.test.advertisement.response.getUserAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserAdvertisementsByUserIdResponse{
	private org.sensat.test.advertisement.response.getUserAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
