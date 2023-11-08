package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetVehicleBrandsRequest{
	private int year;
	private int categoryId;
}
