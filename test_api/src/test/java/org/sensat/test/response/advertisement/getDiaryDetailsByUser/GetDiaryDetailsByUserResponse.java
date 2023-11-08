package org.sensat.test.response.advertisement.getDiaryDetailsByUser;

import lombok.Data;

@Data
public class GetDiaryDetailsByUserResponse{
	private org.sensat.test.response.advertisement.getDiaryDetailsByUser.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
