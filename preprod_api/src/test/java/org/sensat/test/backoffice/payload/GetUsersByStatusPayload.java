package org.sensat.test.backoffice.payload;

import lombok.Data;

@Data
public class GetUsersByStatusPayload{
	private int pageNumber;
	private int userState;
	private int numberOfRecords;
	private int accountType;
}