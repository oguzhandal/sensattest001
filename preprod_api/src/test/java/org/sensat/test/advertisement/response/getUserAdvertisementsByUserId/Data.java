package org.sensat.test.advertisement.response.getUserAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<AllAdvertsItem> allAdverts;
	private int totalRecord;
}
