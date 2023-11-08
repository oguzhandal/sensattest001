package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetVehicleBodyGearTypesRequest{
	private int bodyTypeId;
	private int year;
	private int modelId;
	private int categoryId;
}
