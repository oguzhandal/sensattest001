package org.sensat.test.backoffice.response.getRejectionsByRejectionEntityType;

import lombok.Data;

@Data
public class DataItem{
	private int rejectionId;
	private String rejectionSubject;
	private String rejectionAction;
	private int rejectionActionId;
}