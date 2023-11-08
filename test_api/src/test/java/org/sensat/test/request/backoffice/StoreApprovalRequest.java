package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class StoreApprovalRequest{
	private int backofficeApproveStatus;
	private int storeId;
	private String reasonForRejection;
}
