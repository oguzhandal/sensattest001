package org.sensat.test.response.advertisement.getUserAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<AllAdvertsItem> allAdverts;
	private int totalRecord;
}