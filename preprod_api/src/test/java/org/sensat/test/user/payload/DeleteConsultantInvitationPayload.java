package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class DeleteConsultantInvitationPayload{
	private String storeNo;
	private int invitationId;
}