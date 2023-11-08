package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetJatoVehiclePropsByJatoVehicleIdRequest{
	private long jatoVehicleId;
	private int categoryId;
}
