package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetVehicleFuelTypesRequest{
	private int bodyTypeId;
	private int year;
	private int modelId;
	private int gearTypeId;
	private int categoryId;
}
