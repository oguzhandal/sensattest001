package org.sensat.test.advertisement.response.getAdvertisementImageById;

import lombok.Data;

@Data
public class GetAdvertisementImageByIdResponse {
    private org.sensat.test.advertisement.response.getAdvertisementImageById.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
