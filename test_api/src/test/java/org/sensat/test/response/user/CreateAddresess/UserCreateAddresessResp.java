package org.sensat.test.response.user.CreateAddresess;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
public class UserCreateAddresessResp implements Serializable {
    public ArrayList<Datum> data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
