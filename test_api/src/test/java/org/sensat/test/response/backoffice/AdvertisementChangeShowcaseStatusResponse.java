package org.sensat.test.response.backoffice;

import lombok.Data;

@Data
public class AdvertisementChangeShowcaseStatusResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
