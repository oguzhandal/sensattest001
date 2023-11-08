package org.sensat.test.response.search.recommendedSearch;

import lombok.Data;

@Data
public class RecommendedSearchResponse{
	private org.sensat.test.response.search.recommendedSearch.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
