package org.sensat.test.backoffice.response.getStoreById;

import java.util.List;

@lombok.Data
public class Data {
    private String workDaysBusinessTime;
    private String documentValidityDate;
    private String about;
    private int storeManagerId;
    private int storeStatus;
    private List<Object> authorizedDealerCertificateUrls;
    private String saturdayBusinessTime;
    private String vehicleTradeAuthorizationCertificateUrl;
    private int id;
    private String storeManagerPhone;
    private int storeType;
    private boolean isSystemStore;
    private Address address;
    private String storeTitle;
    private String storeManagerCommercialTitle;
    private String sundayBusinessTime;
    private String certificateNo;
    private String logoUrl;
    private Object rejection;
    private String storeNo;
    private String createdDate;
    private String phone;
    private String storeManagerEmail;
    private String workPhone;
    private String storeManagerSurName;
    private String storeManagerName;
    private String storeCode;
}
