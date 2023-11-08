package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class getStoreFavoriteAdvertisementGraphRequest {
    private String storeNo;
    private int intervalTime;
}
