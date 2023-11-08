package org.sensat.test.search.payload.searchByFilter;

import lombok.Data;

@Data
public class SearchByFilterPayload{
	private Criterias criterias;
	private int sortingCriteria;
	private int pageSize;
	private int page;
}