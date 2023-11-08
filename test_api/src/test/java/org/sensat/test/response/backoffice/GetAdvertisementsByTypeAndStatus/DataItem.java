package org.sensat.test.response.backoffice.GetAdvertisementsByTypeAndStatus;

import lombok.Data;

@Data
public class DataItem{
	private int salesType;
	private Seller seller;
	private int price;
	private String description;
	private int sellerUserId;
	private String plate;
	private int id;
	private String publishedDate;
	private boolean isShowcase;
	private String title;
	private String categoryName;
	private int status;
}
