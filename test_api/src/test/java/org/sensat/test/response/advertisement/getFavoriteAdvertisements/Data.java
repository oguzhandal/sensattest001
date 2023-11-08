package org.sensat.test.response.advertisement.getFavoriteAdvertisements;

import java.util.List;

@lombok.Data
public class Data{
	private List<RecordsItem> records;
	private int totalRecord;
}
