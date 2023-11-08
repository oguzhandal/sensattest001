package org.sensat.test.response.user.UserGetAddresess;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Datum implements Serializable {
    public int addressId;
    public String addressTitle;
    public String addressDetail;
    public int cityId;
    public String city;
    public int townId;
    public String town;
    public int neighborhoodId;
    public String neighborhood;
    public boolean isCurrent;
}

