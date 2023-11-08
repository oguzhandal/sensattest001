package org.sensat.test.response.advertisement.getVehicleYears;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleYearsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
