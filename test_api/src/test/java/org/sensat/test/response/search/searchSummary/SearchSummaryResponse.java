package org.sensat.test.response.search.searchSummary;

import lombok.Data;

@Data
public class SearchSummaryResponse{
	private org.sensat.test.response.search.searchSummary.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
