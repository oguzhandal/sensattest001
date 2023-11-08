package org.sensat.test.response.advertisement.getUserPublishedAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<PublishedAdvertsItem> publishedAdverts;
	private int totalRecord;
}