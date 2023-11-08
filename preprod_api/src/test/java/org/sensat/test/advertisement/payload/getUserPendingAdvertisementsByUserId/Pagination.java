package org.sensat.test.advertisement.payload.getUserPendingAdvertisementsByUserId;

import lombok.Data;

@Data
public class Pagination{
	private int take;
	private int currentPage;
}
