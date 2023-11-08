package org.sensat.test.backoffice.payload.userApproval;

import lombok.Data;

@Data
public class UserApprovalPayload {
    private int backofficeApproveStatus;
    private String userNo;
    private RejectItem rejectItem;
}

