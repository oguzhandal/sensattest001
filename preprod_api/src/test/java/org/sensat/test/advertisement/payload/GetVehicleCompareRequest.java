package org.sensat.test.advertisement.payload;

import java.util.List;

import lombok.Data;

@Data
public class GetVehicleCompareRequest {
    private List<String> advertNo;
}
