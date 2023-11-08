package org.sensat.test.response.advertisement.getUserAdvertisementsByUserId;

import lombok.Data;

@Data
public class GetUserAdvertisementsByUserIdResponse{
	private org.sensat.test.response.advertisement.getUserAdvertisementsByUserId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}