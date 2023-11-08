package org.sensat.test.advertisement.payload.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class Pagination{
	private int take;
	private int currentPage;
}
