package org.sensat.test.response.backoffice.getAdvertisementsById;

import lombok.Data;

@Data
public class GetAdvertisementsByIdResponse{
	private org.sensat.test.response.backoffice.getAdvertisementsById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
