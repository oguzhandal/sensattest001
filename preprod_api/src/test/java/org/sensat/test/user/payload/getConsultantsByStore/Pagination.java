package org.sensat.test.user.payload.getConsultantsByStore;

import lombok.Data;

@Data
public class Pagination{
	private int take;
	private int currentPage;
}