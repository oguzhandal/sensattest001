package org.sensat.test.advertisement.response.checkAdvertisementOwnerById;

import lombok.Data;

@Data
public class CheckAdvertisementOwnerByIdResponse {
    public Datum data;
    public boolean success;
    public Object responseMessage;
    public int responseCode;
}
