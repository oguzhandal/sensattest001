package org.sensat.test.response.user.CancelMembership;

import lombok.Data;

@Data
public class CancelMembershipResponse{
	private org.sensat.test.response.user.CancelMembership.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}