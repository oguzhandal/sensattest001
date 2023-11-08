package org.sensat.test.response.search.recommendedSearch;

import java.util.List;

@lombok.Data
public class Data{
	private List<LastSearchesItem> lastSearches;
	private List<PopularSearchesItem> popularSearches;
	private List<SuggestionsItem> suggestions;
}
