package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class UpdateAddressPayload {
    private int addressId;
    private String addressTitle;
    private String addressDetail;
    private int cityId;
    private int townId;
    private int neighborhoodId;
    private boolean isCurrent;
}
