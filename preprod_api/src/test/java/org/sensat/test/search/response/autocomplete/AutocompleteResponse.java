package org.sensat.test.search.response.autocomplete;

import lombok.Data;

@Data
public class AutocompleteResponse{
	private org.sensat.test.search.response.autocomplete.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
