package org.sensat.test.advertisement.payload;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class GetAdvertisementVehicleDetailsByIdRequest implements Serializable {
    private String advertNo;
}
