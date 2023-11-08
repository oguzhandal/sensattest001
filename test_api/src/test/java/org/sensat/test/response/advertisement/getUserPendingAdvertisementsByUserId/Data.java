package org.sensat.test.response.advertisement.getUserPendingAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<WaitingAdvertsItem> waitingAdverts;
	private int totalRecord;
}