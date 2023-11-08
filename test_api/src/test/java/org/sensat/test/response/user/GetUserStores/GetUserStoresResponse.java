package org.sensat.test.response.user.GetUserStores;

import lombok.Data;

@Data
public class GetUserStoresResponse{
	private org.sensat.test.response.user.GetUserStores.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}