package org.sensat.test.response.user.GetStoreConsultantsByStoreId;

import lombok.Data;

@Data
public class GetStoreConsultantsByStoreIdResponse{
	private org.sensat.test.response.user.GetStoreConsultantsByStoreId.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}