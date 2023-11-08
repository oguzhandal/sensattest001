package org.sensat.test.response.search.getRelatedAdvertisements;

import lombok.Data;

@Data
public class Address{
	private String city;
	private String district;
	private int cityId;
	private int townId;
}