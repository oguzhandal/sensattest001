package org.sensat.test.user.payload;

import java.util.List;

import lombok.Data;

@Data
public class CreateStorePayload {
    private String workDaysBusinessTime;
    private String vehicleTradeAuthorizationCertificate;
    private int storeType;
    private String documentIssueDate;
    private String about;
    private String sundayBusinessTime;
    private int townId;
    private int cityId;
    private String title;
    private String certificateNo;
    private String addressDetail;
    private String phone;
    private String saturdayBusinessTime;
    private String logo;
    private String workPhone;
    private List<String> authorizedDealerCertificates;
}
