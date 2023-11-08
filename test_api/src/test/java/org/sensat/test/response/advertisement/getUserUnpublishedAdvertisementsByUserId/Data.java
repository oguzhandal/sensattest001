package org.sensat.test.response.advertisement.getUserUnpublishedAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<Object> unpublishedAdverts;
	private int totalRecord;
}