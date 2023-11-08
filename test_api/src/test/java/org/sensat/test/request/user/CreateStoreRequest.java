package org.sensat.test.request.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateStoreRequest implements Serializable {
    private String workDaysBusinessTime;
    private String vehicleTradeAuthorizationCertificate;
    private String documentValidityDate;
    private String about;
    private int townId;
    private int cityId;
    private String title;
    private String tradeRegistryGazette;
    private String certificateNo;
    private String logoUrl;
    private String taxPlate;
    private String addressDetail;
    private String phone;
    private String workPhone;
}