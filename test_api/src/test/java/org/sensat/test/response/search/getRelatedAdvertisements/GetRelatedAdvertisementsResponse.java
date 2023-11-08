package org.sensat.test.response.search.getRelatedAdvertisements;

import lombok.Data;

@Data
public class GetRelatedAdvertisementsResponse{
	private org.sensat.test.response.search.getRelatedAdvertisements.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}