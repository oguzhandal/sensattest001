package org.sensat.test.user.response.getSellerInfo;

import lombok.Data;

@Data
public class StoreAddress{
	private String addressDetail;
	private String addressTitle;
	private String town;
	private String city;
	private int cityId;
	private int townId;
	private int addressId;
}