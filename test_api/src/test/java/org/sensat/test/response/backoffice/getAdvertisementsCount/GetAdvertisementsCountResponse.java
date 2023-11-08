package org.sensat.test.response.backoffice.getAdvertisementsCount;

import lombok.Data;

@Data
public class GetAdvertisementsCountResponse{
	private org.sensat.test.response.backoffice.getAdvertisementsCount.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
