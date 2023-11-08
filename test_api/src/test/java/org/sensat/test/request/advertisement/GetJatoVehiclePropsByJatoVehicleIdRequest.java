package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetJatoVehiclePropsByJatoVehicleIdRequest{
	private long jatoVehicleId;
	private int categoryId;
}
