package org.sensat.test.response.advertisement.getVehicleCompare;

import java.util.List;
import lombok.Data;

@Data
public class VehiclesItem{
	private CardData cardData;
	private List<SpecCategoriesItem> specCategories;
}
