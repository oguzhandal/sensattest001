package org.sensat.test.response.backoffice.getUsersByStatus;

import java.util.List;
import lombok.Data;

@Data
public class GetUsersByStatusResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
