package org.sensat.test.request.advertisement;

import lombok.Data;

@Data
public class GetVehicleBrandsRequest{
	private int year;
	private int categoryId;
}
