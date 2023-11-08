package org.sensat.test.user.response.checkIfUserCanCreateAdvertisement;

import lombok.Data;

@Data
public class CheckIfUserCanCreateAdvertisementResponse{
	private org.sensat.test.user.response.checkIfUserCanCreateAdvertisement.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}