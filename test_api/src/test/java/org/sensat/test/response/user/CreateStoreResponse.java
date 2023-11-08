package org.sensat.test.response.user;

import lombok.Data;

@Data
public class CreateStoreResponse {
    private Object data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
