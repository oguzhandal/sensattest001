package org.sensat.test.response.advertisement.getVehicleDetailsPropertiesForCreateAdvertisementQuery;

import lombok.Data;

@Data
public class GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse{
	private org.sensat.test.response.advertisement.getVehicleDetailsPropertiesForCreateAdvertisementQuery.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
