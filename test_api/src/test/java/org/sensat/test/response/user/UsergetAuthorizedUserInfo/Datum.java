package org.sensat.test.response.user.UsergetAuthorizedUserInfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor

public class Datum implements Serializable {

    public int id;
    public String name;
    public String surname;
    public String email;
    public String phone;
    public Object picture;
    public boolean isEmailChangeConfirmed;
    public int gender;
    public int accountType;
    public Object birthDate;
    public String newEmailOnHold;
    public Object citizenNumber;
    public ArrayList<Store> stores;
    public String commercialTitle;
    public int businessType;
    public String companyPhone;
    public String taxNumber;
    public TaxAdministration taxAdministration;
    public City city;
    public Town town;
    public Neighborhood neighborhood;
    public String addressDetail;

}
