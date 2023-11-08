package org.sensat.test.response.user.GetUserConsultants;

import lombok.Data;

@Data
public class GetUserConsultantsResponse{
	private org.sensat.test.response.user.GetUserConsultants.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}