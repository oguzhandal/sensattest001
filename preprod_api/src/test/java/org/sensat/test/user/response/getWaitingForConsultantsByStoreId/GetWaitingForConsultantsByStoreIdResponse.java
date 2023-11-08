package org.sensat.test.user.response.getWaitingForConsultantsByStoreId;

import java.util.List;

import lombok.Data;

@Data
public class GetWaitingForConsultantsByStoreIdResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
