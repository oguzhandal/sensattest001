package org.sensat.test.response.backoffice.getAdvertisementsCount;

import lombok.Data;

@Data
public class DailyCountsItem{
	private int total;
	private int month;
	private int year;
	private int day;
}
