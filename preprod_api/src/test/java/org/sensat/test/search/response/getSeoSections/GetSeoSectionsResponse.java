package org.sensat.test.search.response.getSeoSections;

import lombok.Data;

@Data
public class GetSeoSectionsResponse{
	private org.sensat.test.search.response.getSeoSections.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
