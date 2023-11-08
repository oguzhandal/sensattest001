package org.sensat.test.response.backoffice.GetAdvertisementsByTypeAndStatus;

import java.util.List;
import lombok.Data;

@Data
public class GetAdvertisementsByTypeAndStatusResponse {
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
