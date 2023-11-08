package org.sensat.test.response.advertisement.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class ExpertiseReport{
	private List<Object> expertReportUrl;
	private String totalTramerAmount;
	private String tramerDescription;
	private List<VehicleReportItem> vehicleReport;
}
