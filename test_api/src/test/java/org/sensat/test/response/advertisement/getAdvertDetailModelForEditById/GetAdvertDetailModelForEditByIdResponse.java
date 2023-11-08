package org.sensat.test.response.advertisement.getAdvertDetailModelForEditById;

import lombok.Data;

@Data
public class GetAdvertDetailModelForEditByIdResponse{
	private org.sensat.test.response.advertisement.getAdvertDetailModelForEditById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
