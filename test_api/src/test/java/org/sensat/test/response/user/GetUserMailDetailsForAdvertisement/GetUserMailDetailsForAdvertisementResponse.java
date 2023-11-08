package org.sensat.test.response.user.GetUserMailDetailsForAdvertisement;

import lombok.Data;

@Data
public class GetUserMailDetailsForAdvertisementResponse{
	private String phone;
	private String surname;
	private String name;
	private PermissionsUser permissionsUser;
	private int userId;
	private String email;
}