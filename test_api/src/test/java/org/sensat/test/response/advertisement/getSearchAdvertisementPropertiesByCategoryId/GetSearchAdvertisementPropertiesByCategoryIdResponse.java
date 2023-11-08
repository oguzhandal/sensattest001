package org.sensat.test.response.advertisement.getSearchAdvertisementPropertiesByCategoryId;

import java.util.List;
import lombok.Data;

@Data
public class GetSearchAdvertisementPropertiesByCategoryIdResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
