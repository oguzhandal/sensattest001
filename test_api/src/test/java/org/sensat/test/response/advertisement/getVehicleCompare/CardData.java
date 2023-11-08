package org.sensat.test.response.advertisement.getVehicleCompare;

import java.util.List;
import lombok.Data;

@Data
public class CardData{
	private String summary;
	private String date;
	private String path;
	private List<String> images;
	private Address address;
	private String advertNo;
	private String price;
	private String model;
	private String currency;
	private String id;
	private String brand;
}
