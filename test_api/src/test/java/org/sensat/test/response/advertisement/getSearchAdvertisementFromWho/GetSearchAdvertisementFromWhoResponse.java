package org.sensat.test.response.advertisement.getSearchAdvertisementFromWho;

import java.util.List;
import lombok.Data;

@Data
public class GetSearchAdvertisementFromWhoResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
