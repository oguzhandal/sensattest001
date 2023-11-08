package org.sensat.test.response.backoffice.getStoreById;


@lombok.Data
public class GetStoreByIdResponse{
	private Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
