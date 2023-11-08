package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class AdvertisementChangeShowcaseStatusRequest{
	private int advertisementId;
	private boolean isShowcase;
}
