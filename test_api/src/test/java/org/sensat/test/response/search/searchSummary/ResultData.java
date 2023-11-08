package org.sensat.test.response.search.searchSummary;

import java.util.List;
import lombok.Data;

@Data
public class ResultData{
	private List<AdvertsItem> adverts;
	private String searchResultText;
	private List<Object> stores;
	private String searchedText;
}
