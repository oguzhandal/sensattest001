package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleModelsRequest{
	private int year;
	private int brandId;
	private int categoryId;
}
