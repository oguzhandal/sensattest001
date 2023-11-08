package org.sensat.test.search.payload.searchByFilter;

import lombok.Data;

@Data
public class Criterias{
	private int salesType;
	private Km km;
	private Year year;
	private int storeId;
	private boolean hasOnlyVideo;
	private String searchText;
	private String advertNo;
	private Price price;
	private int providerId;
	private int lastPushlishDate;
	private boolean inner360;
	private boolean advertsNotOptional;
	private String model;
	private SpecsFilter specsFilter;
	private String brand;
	private String categoryId;
}