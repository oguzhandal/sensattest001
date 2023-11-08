package org.sensat.test.response.user.GetConsultantsByStore;

import lombok.Data;

@Data
public class GetConsultantsByStoreResponse {
	private org.sensat.test.response.user.GetConsultantsByStore.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}