package org.sensat.test.user.response.getConsultantsByStore;

import lombok.Data;

@Data
public class GetConsultantsByStoreResponse{
	private org.sensat.test.user.response.getConsultantsByStore.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
