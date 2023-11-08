package org.sensat.test.response.advertisement.getVehicleDetailsPropertiesForCreateAdvertisementQuery;

import java.util.List;

@lombok.Data
public class Data{
	private List<GeneralHardwarePropertiesItem> generalHardwareProperties;
	private List<PlateTypesItem> plateTypes;
}
