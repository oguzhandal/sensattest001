package org.sensat.test.search.response.getVehicleCounts;


@lombok.Data
public class GetVehicleCountsResponse {
    private Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
