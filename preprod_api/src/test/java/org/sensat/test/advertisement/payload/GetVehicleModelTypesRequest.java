package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleModelTypesRequest{
	private int bodyTypeId;
	private int year;
	private int modelId;
	private int gearTypeId;
	private int fuelTypeId;
	private int categoryId;
}
