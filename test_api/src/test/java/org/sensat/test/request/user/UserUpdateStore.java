package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserUpdateStore implements Serializable {
    private Integer storeId;
    private String title;
    private String logoUrl;
    private String about;
    private String businessLicenseUrl;
    private String vehicleTradeAuthorizationCertificateUrl;
    private String certificateNo;
    private String workPhone;
    private String phone;
    private String documentValidityDate;
    private String workDaysBusinessTime;
    private String saturdayBusinessTime;
    private String sundayBusinessTime;
    private String addressDetail;
    private Integer townId;
    private Integer cityId;
}
