package org.sensat.test.search.response.getRelatedAdvertisements;

import lombok.Data;

@Data
public class GetRelatedAdvertisementsResponse{
	private org.sensat.test.search.response.getRelatedAdvertisements.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
