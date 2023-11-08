package org.sensat.test.response.search.getShowcaseAdvertisements;

import lombok.Data;

@Data
public class GetShowcaseAdvertisementsResponse{
	private org.sensat.test.response.search.getShowcaseAdvertisements.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
