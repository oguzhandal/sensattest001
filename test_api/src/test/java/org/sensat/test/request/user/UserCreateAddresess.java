package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UserCreateAddresess implements Serializable {
    private String addressTitle ;
    private String addressDetail;
    private Integer cityId;
    private Integer townId;
    private Integer neighborhoodId;
    private boolean isCurrent;
}
