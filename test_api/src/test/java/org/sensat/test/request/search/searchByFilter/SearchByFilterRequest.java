package org.sensat.test.request.search.searchByFilter;

import lombok.Data;

@Data
public class SearchByFilterRequest{
	private Criterias criterias;
	private int sortingCriteria;
	private int pageSize;
	private int page;
}
