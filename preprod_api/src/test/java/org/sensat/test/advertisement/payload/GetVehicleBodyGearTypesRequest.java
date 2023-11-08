package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleBodyGearTypesRequest{
	private int bodyTypeId;
	private int year;
	private int modelId;
	private int categoryId;
}
