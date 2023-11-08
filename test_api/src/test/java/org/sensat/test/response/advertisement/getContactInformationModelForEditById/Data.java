package org.sensat.test.response.advertisement.getContactInformationModelForEditById;

@lombok.Data
public class Data{
	private boolean phonePermission;
	private String personalPhone;
	private boolean messagePermission;
	private City city;
	private Street street;
	private District district;
	private String landPhone;
}
