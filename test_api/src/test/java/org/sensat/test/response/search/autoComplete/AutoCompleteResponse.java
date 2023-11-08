package org.sensat.test.response.search.autoComplete;

import lombok.Data;

@Data
public class AutoCompleteResponse{
	private org.sensat.test.response.search.autoComplete.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
