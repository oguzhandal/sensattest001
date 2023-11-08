package org.sensat.test.advertisement.response.getFavoriteAdvertisements;

import lombok.Data;

@Data
public class Advert{
	private String date;
	private Features features;
	private String subTitle;
	private String price;
	private String imageUrl;
	private Object discount;
	private String location;
	private String id;
	private String title;
	private String url;
	private String status;
}
