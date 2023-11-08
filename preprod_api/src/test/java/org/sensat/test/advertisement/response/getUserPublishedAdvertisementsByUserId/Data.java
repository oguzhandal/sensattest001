package org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<PublishedAdvertsItem> publishedAdverts;
	private int totalRecord;
}
