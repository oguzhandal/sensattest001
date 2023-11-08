package org.sensat.test.response.advertisement.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class PublishedAdvertsItem{
	private int statusId;
	private Advert advert;
	private int id;
}