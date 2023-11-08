package org.sensat.test.backoffice.response.getStoresCount;

import lombok.Data;

@Data
public class GetStoresCountResponse {
    private org.sensat.test.backoffice.response.getStoresCount.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
