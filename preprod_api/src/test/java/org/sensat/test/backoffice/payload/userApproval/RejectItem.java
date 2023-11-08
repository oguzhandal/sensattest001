package org.sensat.test.backoffice.payload.userApproval;

import lombok.Data;

import java.util.List;

@Data
public class RejectItem {
    private List<Integer> rejectionActionId;
    private String otherAction;
}
