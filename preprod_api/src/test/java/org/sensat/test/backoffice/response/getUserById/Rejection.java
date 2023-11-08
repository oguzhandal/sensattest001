package org.sensat.test.backoffice.response.getUserById;

import java.util.List;
import lombok.Data;

@Data
public class Rejection{
	private String otherAction;
	private List<Object> rejectionActionId;
}