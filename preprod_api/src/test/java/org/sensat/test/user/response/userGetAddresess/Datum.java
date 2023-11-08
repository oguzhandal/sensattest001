package org.sensat.test.user.response.userGetAddresess;

import lombok.Data;

@Data
public class Datum {
    private int addressId;
    private String addressTitle;
    private String addressDetail;
    private int cityId;
    private String city;
    private int townId;
    private String town;
    private int neighborhoodId;
    private String neighborhood;
    private boolean isCurrent;
}
