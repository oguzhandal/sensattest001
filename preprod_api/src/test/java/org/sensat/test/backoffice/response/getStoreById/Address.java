package org.sensat.test.backoffice.response.getStoreById;

import lombok.Data;

@Data
public class Address{
	private String town;
	private String city;
	private String addressDetails;
	private String neighborhood;
}