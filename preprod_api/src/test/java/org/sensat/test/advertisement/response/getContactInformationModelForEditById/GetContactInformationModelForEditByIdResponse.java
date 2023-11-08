package org.sensat.test.advertisement.response.getContactInformationModelForEditById;

import lombok.Data;

@Data
public class GetContactInformationModelForEditByIdResponse{
	private org.sensat.test.advertisement.response.getContactInformationModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
