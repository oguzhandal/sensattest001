package org.sensat.test.response.advertisement.getFavoriteAdvertisements;

import lombok.Data;

@Data
public class RecordsItem{
	private Advert advert;
	private String storeName;
	private String id;
	private boolean isChecked;
}
