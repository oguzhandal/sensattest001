package org.sensat.test.backoffice.response.getAgreementTextById;

import lombok.Data;

@Data
public class GetAgreementTextByIdResponse{
	private org.sensat.test.backoffice.response.getAgreementTextById.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
