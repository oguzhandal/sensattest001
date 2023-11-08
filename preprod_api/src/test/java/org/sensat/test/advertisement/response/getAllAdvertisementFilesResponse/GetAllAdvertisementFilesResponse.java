package org.sensat.test.advertisement.response.getAllAdvertisementFilesResponse;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GetAllAdvertisementFilesResponse {
    public ArrayList<Datum> data;
    public boolean success;
    public String responseMessage;
    public int responseCode;

}
