package org.sensat.test.response.advertisement.getFavoriteAdvertisements;

import lombok.Data;

@Data
public class GetFavoriteAdvertisementsResponse{
	private org.sensat.test.response.advertisement.getFavoriteAdvertisements.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
