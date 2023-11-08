package org.sensat.test.response.user.GetStoreWithDetails;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class Datum implements Serializable {
    public int id;
    public String title;
    public String logoUrl;
    public String about;
    public String vehicleTradeAuthorizationCertificateUrl;
    public String businessLicenceUrl;
    public String certificateNo;
    public String documentValidityDate;
    public String phone;
    public String workPhone;
    public String addressDetail;
    public int cityId;
    public String cityTitle;
    public int townId;
    public String townTitle;
    public String workDaysBusinessTime;
    public String saturdayBusinessTime;
    public String sundayBusinessTime;
}
