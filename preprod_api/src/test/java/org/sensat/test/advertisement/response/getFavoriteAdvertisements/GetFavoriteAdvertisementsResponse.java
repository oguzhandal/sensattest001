package org.sensat.test.advertisement.response.getFavoriteAdvertisements;

import lombok.Data;

@Data
public class GetFavoriteAdvertisementsResponse {
    private org.sensat.test.advertisement.response.getFavoriteAdvertisements.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
