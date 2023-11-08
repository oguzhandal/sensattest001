package org.sensat.test.advertisement.response.getAdvertisementById;

import java.util.List;
import lombok.Data;

@Data
public class ExpertiseReport{
	private List<String> expertReportUrl;
	private String totalTramerAmount;
	private String tramerDescription;
	private List<VehicleReportItem> vehicleReport;
}
