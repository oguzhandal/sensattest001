package org.sensat.test.user.response.getUserAgreementTexts;

import lombok.Data;

@Data
public class GetUserAgreementTextsResponse{
	private org.sensat.test.user.response.getUserAgreementTexts.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
