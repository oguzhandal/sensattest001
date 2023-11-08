package org.sensat.test.backoffice.response.getCorporateClientDetailsByDate;

import lombok.Data;

@Data
public class GetCorporateClientDetailsByDateResponse{
	private org.sensat.test.backoffice.response.getCorporateClientDetailsByDate.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
