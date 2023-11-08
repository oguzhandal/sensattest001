package org.sensat.test.user.response.getAllCities;

import java.util.List;

import lombok.Data;

@Data
public class GetAllCitiesResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
