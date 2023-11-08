package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class CreateAddressPayload{
	private int neighborhoodId;
	private boolean isCurrent;
	private String addressDetail;
	private String addressTitle;
	private int cityId;
	private int townId;
}