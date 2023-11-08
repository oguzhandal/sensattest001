package org.sensat.test.response.backoffice.getStoresCount;

import lombok.Data;

@Data
public class GetStoresCountResponse{
	private org.sensat.test.response.backoffice.getStoresCount.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
