package org.sensat.test.advertisement.response.getVehicleCompare;

import java.util.List;
import lombok.Data;

@Data
public class VehiclesItem{
	private CardData cardData;
	private List<SpecCategoriesItem> specCategories;
}
