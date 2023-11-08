package org.sensat.test.advertisement.response.getFavoriteAdvertisements;

import lombok.Data;

@Data
public class RecordsItem{
	private Advert advert;
	private String storeName;
	private String id;
	private boolean isChecked;
}
