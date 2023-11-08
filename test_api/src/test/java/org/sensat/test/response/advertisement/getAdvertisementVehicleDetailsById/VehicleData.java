package org.sensat.test.response.advertisement.getAdvertisementVehicleDetailsById;

@lombok.Data
public class VehicleData{
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
