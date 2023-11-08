package org.sensat.test.advertisement.response.getUserPendingAdvertisementsByUserId;

import java.util.List;

@lombok.Data
public class Data{
	private List<WaitingAdvertsItem> waitingAdverts;
	private int totalRecord;
}
