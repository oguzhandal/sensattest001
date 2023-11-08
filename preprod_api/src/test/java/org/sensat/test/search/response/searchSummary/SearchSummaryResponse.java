package org.sensat.test.search.response.searchSummary;

import lombok.Data;

@Data
public class SearchSummaryResponse{
	private org.sensat.test.search.response.searchSummary.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
