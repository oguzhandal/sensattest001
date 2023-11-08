package org.sensat.test.request.advertisement.getUserUnpublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class Pagination{
	private int take;
	private int currentPage;
}