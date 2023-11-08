package org.sensat.test.response.advertisement.getUserPendingAdvertisementsByUserId;

import lombok.Data;

@Data
public class WaitingAdvertsItem{
	private int statusId;
	private Advert advert;
	private int id;
}