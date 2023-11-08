package org.sensat.test.user.response.getAuthorizedUserInfo;

import java.util.List;

@lombok.Data
public class Data {
    private int gender;
    private City city;
    private String userNo;
    private boolean canCreateAdvertisement;
    private String addressDetail;
    private String companyPhone;
    private String surname;
    private int id;
    private TaxAdministrationCity taxAdministrationCity;
    private String email;
    private Object newEmailOnHold;
    private TaxAdministration taxAdministration;
    private boolean isChangeableAccount;
    private boolean isEmailChangeConfirmed;
    private Town town;
    private String commercialTitle;
    private List<StoresItem> stores;
    private int accountType;
    private String taxNumber;
    private boolean isHold;
    private Object birthDate;
    private String picture;
    private String phone;
    private String citizenNumber;
    private String name;
    private Neighborhood neighborhood;
    private String kepAddress;
    private int businessType;
    private boolean isConsultant;
}
