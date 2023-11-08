package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;

@lombok.Data
public class Data {
    private VehicleOptionsResult vehicleOptionsResult;
    private UserInfo userInfo;
    private HardwareSpecsResult hardwareSpecsResult;
    private List<String> notes;
    private GeneralSpecsResult generalSpecsResult;
    private String threeDImage;
    private InsuranceTypes insuranceTypes;
    private Object searchingArea;
    private AdvertisementImages advertisementImages;
    private ExpertiseReport expertiseReport;
    private String video;
    private Object suggest;
    private String fromForSale;
    private DeliveryOptions deliveryOptions;
    private String pledgeAndLienDetails;
    private String advertNo;
    private SellerDescription sellerDescription;
    private int statusId;
    private AdvertisementSummary advertisementSummary;
    private BreadCrumb breadCrumb;
    private int id;
    private StoreInfo storeInfo;
    private PaymentTypes paymentTypes;
    private VehicleRentOptionResult vehicleRentOptionResult;
}
