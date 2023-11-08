package org.sensat.test.advertisement.response.getAdvertisementById;

import lombok.Data;

@Data
public class GetAdvertisementByIdResponse{
	private org.sensat.test.advertisement.response.getAdvertisementById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
