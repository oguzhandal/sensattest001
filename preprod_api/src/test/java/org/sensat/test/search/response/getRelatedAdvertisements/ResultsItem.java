package org.sensat.test.search.response.getRelatedAdvertisements;

import java.util.List;
import lombok.Data;

@Data
public class ResultsItem{
	private String priceFormated;
	private int modelId;
	private int year;
	private Object searchingArea;
	private String title;
	private SeacrhFilter seacrhFilter;
	private boolean isNonDamaged;
	private String priceInfo;
	private String path;
	private List<SpecsItem> specs;
	private String advertNo;
	private int price;
	private String advertisementDate;
	private String model;
	private String currency;
	private int id;
	private String brand;
	private String summary;
	private int salesType;
	private String autocompleteStore;
	private int km;
	private List<String> images;
	private Address address;
	private boolean isFavorited;
	private boolean isOptional;
	private Suggest suggest;
	private SellerInfo sellerInfo;
	private String autocompleteCar;
	private String advertisementDateFormated;
	private int brandId;
	private boolean isShowcase;
	private String category;
	private int categoryId;
	private List<PropertiesItem> properties;
}