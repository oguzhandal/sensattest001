package org.sensat.test.backoffice.response.getUserById;

import java.util.List;

@lombok.Data
public class Data {
    private String profilePictureUrl;
    private Address address;
    private Object commercialTitle;
    private int accountType;
    private String userNo;
    private List<AgreementsItem> agreements;
    private Rejection rejection;
    private TaxInfo taxInfo;
    private String createdDate;
    private String phone;
    private int userState;
    private Object companyPhone;
    private String surname;
    private String citizenNumber;
    private String name;
    private int id;
    private Object kepAddress;
    private Object businessType;
    private String email;
    private boolean isVknApproved;
}
