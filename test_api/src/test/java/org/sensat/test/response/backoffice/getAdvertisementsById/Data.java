package org.sensat.test.response.backoffice.getAdvertisementsById;

import java.util.List;

@lombok.Data
public class Data{
	private int salesType;
	private int approvalStatus;
	private Seller seller;
	private String subModel;
	private String description;
	private int sellerUserId;
	private String plate;
	private String title;
	private String categoryName;
	private int price;
	private String model;
	private int id;
	private String publishedDate;
	private boolean isShowcase;
	private Object rejectionReason;
	private String brand;
	private List<PropertiesItem> properties;
}
