package org.sensat.test.backoffice.response;

import lombok.Data;

@Data
public class UserApprovalResponse {
    private Object data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
