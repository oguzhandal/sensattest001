package org.sensat.test.advertisement.response.getJatoVehiclePropsByJatoVehicleId;

import lombok.Data;

@Data
public class GetJatoVehiclePropsByJatoVehicleIdResponse {
    private org.sensat.test.advertisement.response.getJatoVehiclePropsByJatoVehicleId.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
