package org.sensat.test.response.user.GetActiveStoresByUser;

import java.util.List;
import lombok.Data;

@Data
public class GetActiveStoresByUserResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}