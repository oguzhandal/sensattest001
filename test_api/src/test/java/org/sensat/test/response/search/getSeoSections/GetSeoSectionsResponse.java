package org.sensat.test.response.search.getSeoSections;

import lombok.Data;

@Data
public class GetSeoSectionsResponse{
	private org.sensat.test.response.search.getSeoSections.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
