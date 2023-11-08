package org.sensat.test.search.payload;

import lombok.Data;

@Data
public class GetInsideVehicleModelsPayload{
    private Integer categoryId;
    private Integer year;
    private Integer brandId;
}
