package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class UserApprovalRequest{
	private int backofficeApproveStatus;
	private int userId;
	private String reasonForRejection;
}
