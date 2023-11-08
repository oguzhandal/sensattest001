package org.sensat.test.response.advertisement.getAdvertisementDetailsForCreateAdvertisementByCategoryId;

import lombok.Data;

@Data
public class GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse{
	private org.sensat.test.response.advertisement.getAdvertisementDetailsForCreateAdvertisementByCategoryId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
