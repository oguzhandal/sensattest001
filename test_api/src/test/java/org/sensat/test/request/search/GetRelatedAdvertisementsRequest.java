package org.sensat.test.request.search;

import lombok.Data;

@Data
public class GetRelatedAdvertisementsRequest{
	private String model;
	private String brand;
	private int categoryId;
}