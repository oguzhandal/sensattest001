package org.sensat.test.user.payload.getConsultantsByStore;

import lombok.Data;

@Data
public class GetConsultantsByStorePayload{
	private String storeNo;
	private Pagination pagination;
}