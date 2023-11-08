package org.sensat.test.advertisement.response.createVehicleAdvertisement;

import lombok.Data;

@Data
public class CreateVehicleAdvertisementResponse {
    private org.sensat.test.advertisement.response.createVehicleAdvertisement.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
