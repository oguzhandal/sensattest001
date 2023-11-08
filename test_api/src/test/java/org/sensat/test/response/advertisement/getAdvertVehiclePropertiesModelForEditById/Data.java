package org.sensat.test.response.advertisement.getAdvertVehiclePropertiesModelForEditById;

import java.util.List;

@lombok.Data
public class Data{
	private List<GeneralHardwarePropertiesItem> generalHardwareProperties;
	private Color color;
	private List<PlateTypesItem> plateTypes;
	private String plateType;
	private List<Object> videoGalleryItems;
	private String kilometer;
	private String plate;
	private String exitDate;
	private List<Object> threeDGalleryItems;
	private List<String> photoGalleryItems;
}
