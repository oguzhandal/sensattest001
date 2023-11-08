package org.sensat.test.response.advertisement.getAdvertisementImageById;

import lombok.Data;

@Data
public class GetAdvertisementImageByIdResponse {
    private org.sensat.test.response.advertisement.getAdvertisementImageById.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}