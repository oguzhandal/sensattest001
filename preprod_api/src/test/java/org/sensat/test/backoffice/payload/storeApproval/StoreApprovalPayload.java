package org.sensat.test.backoffice.payload.storeApproval;

import lombok.Data;

@Data
public class StoreApprovalPayload{
	private String storeNo;
	private int backofficeApproveStatus;
	private RejectItem rejectItem;
}