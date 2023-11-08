package org.sensat.test.backoffice.response.getStoresByStatus;

import java.util.List;

import lombok.Data;

@Data
public class DataItem {
    private String workDaysBusinessTime;
    private String documentValidityDate;
    private String about;
    private int storeManagerId;
    private boolean isUpdated;
    private int storeStatus;
    private List<Object> authorizedDealerCertificateUrls;
    private Object saturdayBusinessTime;
    private String vehicleTradeAuthorizationCertificateUrl;
    private int id;
    private String createDate;
    private String storeManagerPhone;
    private int storeType;
    private boolean isSystemStore;
    private String storeTitle;
    private String storeManagerCommercialTitle;
    private String taxNumber;
    private Object sundayBusinessTime;
    private String certificateNo;
    private String logoUrl;
    private String storeNo;
    private String phone;
    private String storeManagerEmail;
    private String workPhone;
    private String storeManagerSurName;
    private Object rejectionReason;
    private String storeManagerName;
    private String storeCode;
}
