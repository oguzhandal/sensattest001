package org.sensat.test.request.advertisement;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class GetAdvertisementVehicleDetailsByIdRequest implements Serializable {
    private Integer advertisementId;
}
