package org.sensat.test.advertisement.payload.getUserAdvertisementsByUserId;

import lombok.Data;

@Data
public class Pagination{
	private int take;
	private int currentPage;
}
