package org.sensat.test.advertisement.response.getVehicleDetailsPropertiesForCreateAdvertisementQuery;

import lombok.Data;

@Data
public class GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse{
	private org.sensat.test.advertisement.response.getVehicleDetailsPropertiesForCreateAdvertisementQuery.Data data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
