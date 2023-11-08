package org.sensat.test.backoffice.response.getRejectionsByRejectionEntityType;

import java.util.List;

import lombok.Data;

@Data
public class GetRejectionsByRejectionEntityTypeResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
