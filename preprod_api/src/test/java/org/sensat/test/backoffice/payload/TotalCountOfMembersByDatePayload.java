package org.sensat.test.backoffice.payload;

import lombok.Data;

@Data
public class TotalCountOfMembersByDatePayload{
	private String endDate;
	private String startDate;
}