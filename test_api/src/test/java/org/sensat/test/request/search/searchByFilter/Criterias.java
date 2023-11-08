package org.sensat.test.request.search.searchByFilter;

import lombok.Data;

@Data
public class Criterias{
	private int salesType;
	private Km km;
	private Year year;
	private boolean hasOnlyVideo;
	private boolean hasOnlyPhoto;
	private String searchText;
	private Price price;
	private int lastPushlishDate;
	private boolean inner360;
	private boolean advertsNotOptional;
	private String model;
	private SpecsFilter specsFilter;
	private String brand;
	private String categoryId;
}
