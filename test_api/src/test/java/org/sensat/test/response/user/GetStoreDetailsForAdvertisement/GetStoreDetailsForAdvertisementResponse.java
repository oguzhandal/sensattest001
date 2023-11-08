package org.sensat.test.response.user.GetStoreDetailsForAdvertisement;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class GetStoreDetailsForAdvertisementResponse implements Serializable {
    public int storeId;
    public String title;
    public String logoUrl;
    public String about;
    public String businessLicenseUrl;
    public int storeStatus;
    public String storeManagerName;
    public String storeManagerPhone;
    public Object rejectionReason;
    public int cityId;
    public int townId;
}
