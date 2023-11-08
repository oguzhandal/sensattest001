package org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId;

import lombok.Data;

@Data
public class PublishedAdvertsItem{
	private int statusId;
	private Advert advert;
	private int id;
}
