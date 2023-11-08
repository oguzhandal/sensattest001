package org.sensat.test.backoffice.response.getUsersByStatus;

import lombok.Data;

@Data
public class DataItem {
    private String profilePictureUrl;
    private String commercialTitle;
    private String userNo;
    private int accountType;
    private String taxNumber;
    private String phone;
    private int userState;
    private String companyPhone;
    private String surname;
    private String citizenNumber;
    private String name;
    private int id;
    private int businessType;
    private Object rejectionReason;
    private String email;
    private String createDate;
}
