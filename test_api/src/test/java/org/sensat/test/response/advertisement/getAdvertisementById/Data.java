package org.sensat.test.response.advertisement.getAdvertisementById;

@lombok.Data
public class Data{
	private VehicleOptionsResult vehicleOptionsResult;
	private UserInfo userInfo;
	private HardwareSpecsResult hardwareSpecsResult;
	private GeneralSpecsResult generalSpecsResult;
	private InsuranceTypes insuranceTypes;
	private AdvertisementImages advertisementImages;
	private ExpertiseReport expertiseReport;
	private DeliveryOptions deliveryOptions;
	private SellerDescription sellerDescription;
	private AdvertisementSummary advertisementSummary;
	private BreadCrumb breadCrumb;
	private Object storeInfo;
	private PaymentTypes paymentTypes;
	private VehicleRentOptionResult vehicleRentOptionResult;
}
