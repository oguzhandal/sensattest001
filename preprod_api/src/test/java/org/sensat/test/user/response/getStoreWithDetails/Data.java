package org.sensat.test.user.response.getStoreWithDetails;

import java.util.List;

@lombok.Data
public class Data {
    private String workDaysBusinessTime;
    private List<VehicleTradeAuthorizationCertificateItem> vehicleTradeAuthorizationCertificate;
    private int storeType;
    private String documentIssueDate;
    private String about;
    private String sundayBusinessTime;
    private int cityId;
    private int townId;
    private String title;
    private String certificateNo;
    private String storeNo;
    private String addressDetail;
    private boolean isEditable;
    private String phone;
    private String saturdayBusinessTime;
    private String townTitle;
    private List<LogoItem> logo;
    private int documentValidityRemainingDays;
    private String workPhone;
    private int id;
    private List<AuthorizedDealerCertificatesItem> authorizedDealerCertificates;
    private String cityTitle;
}
