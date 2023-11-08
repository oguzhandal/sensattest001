package org.sensat.test.advertisement.response;

import lombok.Data;

@Data
public class UpdateAdvertisementOptionalStatusResponse {
    private Object data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
