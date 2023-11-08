package org.sensat.test.user.response.getConsultants;

import lombok.Data;

@Data
public class GetConsultantsResponse{
	private org.sensat.test.user.response.getConsultants.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
