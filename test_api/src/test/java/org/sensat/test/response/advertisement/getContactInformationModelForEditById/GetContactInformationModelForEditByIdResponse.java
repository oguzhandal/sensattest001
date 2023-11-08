package org.sensat.test.response.advertisement.getContactInformationModelForEditById;

import lombok.Data;

@Data
public class GetContactInformationModelForEditByIdResponse{
	private org.sensat.test.response.advertisement.getContactInformationModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
