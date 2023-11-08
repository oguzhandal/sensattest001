package org.sensat.test.response.advertisement.getAdvertisementById;

import lombok.Data;

@Data
public class GetAdvertisementByIdResponse{
	private org.sensat.test.response.advertisement.getAdvertisementById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
