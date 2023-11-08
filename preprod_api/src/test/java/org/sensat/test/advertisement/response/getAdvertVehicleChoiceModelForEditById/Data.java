package org.sensat.test.advertisement.response.getAdvertVehicleChoiceModelForEditById;

@lombok.Data
public class Data{
	private BodyType bodyType;
	private String selectedCarType;
	private String selectedAdvertType;
	private Year year;
	private SubModel subModel;
	private Fuel fuel;
	private Model model;
	private Gearbox gearbox;
	private Brand brand;
}
