package org.sensat.test.response.advertisement.getVehicleCompare;

import java.util.List;
import lombok.Data;

@Data
public class SpecCategoriesItem{
	private String specType;
	private List<SpecsItem> specs;
	private String title;
	private String type;
	private Object vehicleReport;
}
