package org.sensat.test.user.response;

import lombok.Data;

@Data
public class BaseResponse {
    private Object data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
