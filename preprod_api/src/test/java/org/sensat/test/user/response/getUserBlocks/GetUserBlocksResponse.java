package org.sensat.test.user.response.getUserBlocks;

import java.util.List;
import lombok.Data;

@Data
public class GetUserBlocksResponse {
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
