package org.sensat.test.backoffice.payload.storeApproval;

import java.util.List;
import lombok.Data;

@Data
public class RejectItem{
	private String otherAction;
	private List<Integer> rejectionActionId;
}