package org.sensat.test.advertisement.response.getJatoVehiclePropsByJatoVehicleId;

import java.util.List;

@lombok.Data
public class Data{
	private List<VehicleSpecsItem> vehicleSpecs;
	private List<SizeSpecsItem> sizeSpecs;
	private List<FuelConsumptionSpecsItem> fuelConsumptionSpecs;
}
