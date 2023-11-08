package org.sensat.test.user.response.getStoreByStoreId;

import lombok.Data;

@Data
public class GetStoreByStoreIdResponse{
	private org.sensat.test.user.response.getStoreByStoreId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
