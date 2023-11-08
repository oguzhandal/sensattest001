package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class GetUsersByStatusRequest {
	private int pageNumber;
	private int numberOfRecords;
}
