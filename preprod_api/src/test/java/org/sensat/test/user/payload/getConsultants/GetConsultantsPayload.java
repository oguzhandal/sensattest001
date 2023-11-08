package org.sensat.test.user.payload.getConsultants;

import lombok.Data;

@Data
public class GetConsultantsPayload{
	private Pagination pagination;
	private Object consultantType;
}