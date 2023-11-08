package org.sensat.test.response.advertisement.createVehicleAdvertisement;

import lombok.Data;

@Data
public class CreateVehicleAdvertisementResponse {
    private org.sensat.test.response.advertisement.createVehicleAdvertisement.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}