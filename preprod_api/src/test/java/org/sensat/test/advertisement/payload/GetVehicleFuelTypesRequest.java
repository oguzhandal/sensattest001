package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleFuelTypesRequest{
	private int bodyTypeId;
	private int year;
	private int modelId;
	private int gearTypeId;
	private int categoryId;
}
