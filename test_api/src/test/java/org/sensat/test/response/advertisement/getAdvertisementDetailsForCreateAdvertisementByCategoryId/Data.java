package org.sensat.test.response.advertisement.getAdvertisementDetailsForCreateAdvertisementByCategoryId;

import java.util.List;

@lombok.Data
public class Data{
	private List<SwapStatusItem> swapStatus;
	private List<GuaranteesItem> guarantees;
	private List<SellersItem> sellers;
	private List<VehicleStatusItem> vehicleStatus;
}
