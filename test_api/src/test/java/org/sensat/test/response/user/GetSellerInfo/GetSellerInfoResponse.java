package org.sensat.test.response.user.GetSellerInfo;

import lombok.Data;

@Data
public class GetSellerInfoResponse{
	private org.sensat.test.response.user.GetSellerInfo.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}