package org.sensat.test.backoffice.response.totalCountOfMembersByDate;

import lombok.Data;

@Data
public class TotalCountOfMembersByDateResponse{
	private org.sensat.test.backoffice.response.totalCountOfMembersByDate.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
