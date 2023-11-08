package org.sensat.test.backoffice.response.getCorporateClientDetailsByDate;

import lombok.Data;

@Data
public class DetailsItem{
	private String date;
	private int activeTotalCount;
	private int totalCount;
}