package org.sensat.test.response.user.GetUserDetailsForAdvertisement;

import lombok.Data;

@Data
public class GetUserDetailsForAdvertisementResponse{
	private String profilePhoto;
	private String phone;
	private String surname;
	private String name;
	private int userId;
	private String email;
}