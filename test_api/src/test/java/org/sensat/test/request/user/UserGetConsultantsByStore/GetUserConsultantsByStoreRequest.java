package org.sensat.test.request.user.UserGetConsultantsByStore;

import lombok.Data;

@Data
public class GetUserConsultantsByStoreRequest{
	private Pagination pagination;
	private int storeId;
}