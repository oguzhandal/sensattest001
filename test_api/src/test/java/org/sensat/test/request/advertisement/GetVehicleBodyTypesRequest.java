package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetVehicleBodyTypesRequest{
	private int year;
	private int modelId;
	private int categoryId;
}
