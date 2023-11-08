package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class GetStoresByStatusRequest{
	private int pageNumber;
	private int numberOfRecords;
}
