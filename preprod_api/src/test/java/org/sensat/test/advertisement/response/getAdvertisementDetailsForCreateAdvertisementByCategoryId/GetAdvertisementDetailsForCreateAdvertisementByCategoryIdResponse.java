package org.sensat.test.advertisement.response.getAdvertisementDetailsForCreateAdvertisementByCategoryId;

import lombok.Data;

@Data
public class GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse{
	private org.sensat.test.advertisement.response.getAdvertisementDetailsForCreateAdvertisementByCategoryId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
