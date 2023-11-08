package org.sensat.test.backoffice.response.getStoresByStatus;

import java.util.List;

import lombok.Data;

@Data
public class GetStoresByStatusResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
