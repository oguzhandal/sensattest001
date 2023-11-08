package org.sensat.test.response.search.searchByFilter;

import lombok.Data;

@Data
public class SearchByFilterResponse{
	private org.sensat.test.response.search.searchByFilter.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
