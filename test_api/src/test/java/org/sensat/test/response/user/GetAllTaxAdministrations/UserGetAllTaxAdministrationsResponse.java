package org.sensat.test.response.user.GetAllTaxAdministrations;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
public class UserGetAllTaxAdministrationsResponse implements Serializable {
    public ArrayList<Datum> data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
