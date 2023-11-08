package org.sensat.test.user.response.getStoreConsultantsByStoreId;

import lombok.Data;

@Data
public class GetStoreConsultantsByStoreIdaResponse{
	private org.sensat.test.user.response.getStoreConsultantsByStoreId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
