package org.sensat.test.search.response.searchByFilter;

import lombok.Data;

@Data
public class SearchByFilterResponse{
	private org.sensat.test.search.response.searchByFilter.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
