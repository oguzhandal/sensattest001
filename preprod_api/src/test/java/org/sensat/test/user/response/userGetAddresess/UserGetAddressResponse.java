package org.sensat.test.user.response.userGetAddresess;

import lombok.Data;

import java.util.ArrayList;

@Data
public class UserGetAddressResponse {
    private ArrayList<Datum> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
