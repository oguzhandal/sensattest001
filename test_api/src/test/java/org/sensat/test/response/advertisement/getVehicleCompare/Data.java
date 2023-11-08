package org.sensat.test.response.advertisement.getVehicleCompare;

import java.util.List;

@lombok.Data
public class Data{
	private String specsDescription;
	private List<VehiclesItem> vehicles;
	private String title;
	private String showAdvertiserButtonLabel;
	private String showVehicleCardButtonLabel;
}
