package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class UpdateContactPermissionPayload{
	private boolean callingApprove;
	private boolean mailingApprove;
	private boolean smsApprove;
}