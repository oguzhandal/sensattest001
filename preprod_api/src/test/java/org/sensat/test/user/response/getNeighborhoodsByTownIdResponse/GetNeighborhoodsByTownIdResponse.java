package org.sensat.test.user.response.getNeighborhoodsByTownIdResponse;

import java.util.List;
import lombok.Data;

@Data
public class GetNeighborhoodsByTownIdResponse {
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
