package org.sensat.test.advertisement.response.getAdvertDetailModelForEditById;

import lombok.Data;

@Data
public class GetAdvertDetailModelForEditByIdResponse{
	private org.sensat.test.advertisement.response.getAdvertDetailModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
