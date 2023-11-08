package org.sensat.test.user.response.getStoresByUser;

import java.util.List;

import lombok.Data;

@Data
public class GetStoresByUserResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
