package org.sensat.test.user.response.getIsStoreExist;

import lombok.Data;

@Data
public class GetIsStoreExistResponse{
	private org.sensat.test.user.response.getIsStoreExist.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
