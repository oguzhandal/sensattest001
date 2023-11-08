package org.sensat.test.search.response.getRelatedAdvertisements;

import lombok.Data;

@Data
public class SellerInfo{
	private int sellerId;
	private String phone;
	private int accountType;
	private String name;
	private int storeId;
}