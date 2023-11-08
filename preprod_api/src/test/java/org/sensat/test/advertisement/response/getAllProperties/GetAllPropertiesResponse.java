package org.sensat.test.advertisement.response.getAllProperties;

import java.util.List;
import lombok.Data;

@Data
public class GetAllPropertiesResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
