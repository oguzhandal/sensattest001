package org.sensat.test.search.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class ExpertiseReport{
	private List<Object> expertReportUrl;
	private String totalTramerAmount;
	private Object tramerDescription;
	private List<VehicleReportItem> vehicleReport;
}