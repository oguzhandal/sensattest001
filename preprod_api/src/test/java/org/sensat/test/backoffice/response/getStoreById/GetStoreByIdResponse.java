package org.sensat.test.backoffice.response.getStoreById;

import lombok.Data;

@Data
public class GetStoreByIdResponse{
	private org.sensat.test.backoffice.response.getStoreById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
