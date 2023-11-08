package org.sensat.test.search.response.getInsideVehicleYears;

import java.util.List;
import lombok.Data;

@Data
public class GetInsideVehicleYearsResponse{
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}