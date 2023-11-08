package org.sensat.test.response.backoffice.getUsersByStatus;

import lombok.Data;

@Data
public class DataItem{
	private Object profilePictureUrl;
	private String commercialTitle;
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
}
