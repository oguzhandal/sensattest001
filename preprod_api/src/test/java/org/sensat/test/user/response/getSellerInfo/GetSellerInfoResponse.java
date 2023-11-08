package org.sensat.test.user.response.getSellerInfo;

import lombok.Data;

@Data
public class GetSellerInfoResponse{
	private org.sensat.test.user.response.getSellerInfo.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
