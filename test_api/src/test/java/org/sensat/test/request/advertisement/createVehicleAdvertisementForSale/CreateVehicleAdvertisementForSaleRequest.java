package org.sensat.test.request.advertisement.createVehicleAdvertisementForSale;

import java.util.List;
import lombok.Data;

@Data
public class CreateVehicleAdvertisementForSaleRequest{
	private int salesType;
	private String mobilePhoneNumber;
	private boolean isShowAddress;
	private String threeDImage;
	private String description;
	private int sellerUserId;
	private int cityId;
	private int townId;
	private String video;
	private String title;
	private String storeId;
	private long jatoVehicleId;
	private List<AdvertisementMediasItem> advertisementMedias;
	private int addressId;
	private boolean isShowPhoneNumber;
	private int price;
	private int neighboorhoodId;
	private String fixedPhoneNumber;
	private List<Object> expertReportFile;
	private int categoryId;
	private boolean isSendMessage;
	private List<PropertiesItem> properties;
}
