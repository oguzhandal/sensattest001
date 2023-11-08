package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetVehicleModelsRequest{
	private int year;
	private int brandId;
	private int categoryId;
}
