package org.sensat.test.search.response.getShowcaseAdvertisements;

import lombok.Data;

@Data
public class GetShowcaseAdvertisementsResponse{
	private org.sensat.test.search.response.getShowcaseAdvertisements.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
