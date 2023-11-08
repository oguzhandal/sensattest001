package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class AdvertisementApprovalRequest{
	private int approvalStatus;
	private int advertisementId;
	private String reasonForRejection;
}
