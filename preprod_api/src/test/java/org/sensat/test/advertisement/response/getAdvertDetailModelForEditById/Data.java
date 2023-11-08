package org.sensat.test.advertisement.response.getAdvertDetailModelForEditById;

import java.util.List;

@lombok.Data
public class Data{
	private String seller;
	private List<ExpertiseReportItemsItem> expertiseReportItems;
	private String tramDescription;
	private String price;
	private String guarantee;
	private String swapStatus;
	private String tramAmount;
	private List<ExpertReportItem> expertReport;
	private String vehicleStatus;
}
