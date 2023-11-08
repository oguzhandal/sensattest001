package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class AdvertisementSummary{
	private String summary;
	private String date;
	private int salesType;
	private Address address;
	private String salePrice;
	private boolean isFavorited;
	private boolean isOptional;
	private List<SpecsItem> specs;
	private boolean isShowPhoneNumber;
	private boolean isRental;
	private List<Object> rentingInfos;
	private String model;
	private String currency;
	private int id;
	private String brand;
	private int categoryId;
	private boolean isSendMessage;
}