package org.sensat.test.user.response.viewUserHistoryDetails;

import java.util.List;

@lombok.Data
public class Data {
    private String profilePictureUrl;
    private Address address;
    private String commercialTitle;
    private String userNo;
    private int accountType;
    private List<AgreementsItem> agreements;
    private Object rejection;
    private TaxInfo taxInfo;
    private String createdDate;
    private String phone;
    private int userState;
    private String companyPhone;
    private String surname;
    private String citizenNumber;
    private String name;
    private int id;
    private String kepAddress;
    private int businessType;
    private String email;
    private boolean isVknApproved;
}
