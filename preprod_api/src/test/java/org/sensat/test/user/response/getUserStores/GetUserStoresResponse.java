package org.sensat.test.user.response.getUserStores;

import lombok.Data;

@Data
public class GetUserStoresResponse{
	private org.sensat.test.user.response.getUserStores.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
