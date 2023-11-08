package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleBodyTypesRequest{
	private int year;
	private int modelId;
	private int categoryId;
}
