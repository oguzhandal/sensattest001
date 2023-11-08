package org.sensat.test.advertisement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class VehicleAdvertisementResponse implements Serializable {
    public Object data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
