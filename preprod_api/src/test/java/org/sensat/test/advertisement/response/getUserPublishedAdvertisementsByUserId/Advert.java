package org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class Advert{
	private String date;
	private String priceWithoutCurrency;
	private String title;
	private String url;
	private Features features;
	private String subTitle;
	private String price;
	private String imageUrl;
	private String location;
	private int id;
	private Object rejectionReason;
	private String status;
	private Statistics statistics;
}
