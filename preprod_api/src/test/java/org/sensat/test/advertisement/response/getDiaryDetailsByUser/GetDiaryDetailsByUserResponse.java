package org.sensat.test.advertisement.response.getDiaryDetailsByUser;

import lombok.Data;

@Data
public class GetDiaryDetailsByUserResponse{
	private org.sensat.test.advertisement.response.getDiaryDetailsByUser.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
