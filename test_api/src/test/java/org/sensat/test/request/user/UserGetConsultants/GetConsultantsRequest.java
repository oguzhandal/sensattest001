package org.sensat.test.request.user.UserGetConsultants;

import lombok.Data;

@Data
public class GetConsultantsRequest{
	private Pagination pagination;
	private int consultantType;
}