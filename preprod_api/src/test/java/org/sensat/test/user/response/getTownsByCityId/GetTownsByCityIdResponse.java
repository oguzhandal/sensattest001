package org.sensat.test.user.response.getTownsByCityId;

import java.util.List;
import lombok.Data;

@Data
public class GetTownsByCityIdResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}