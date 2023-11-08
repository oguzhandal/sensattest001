package org.sensat.test.advertisement.response.getVehicleCompare;

import java.util.List;

@lombok.Data
public class Data{
	private String specsDescription;
	private List<VehiclesItem> vehicles;
	private String title;
	private String showAdvertiserButtonLabel;
	private String showVehicleCardButtonLabel;
}
