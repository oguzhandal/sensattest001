package org.sensat.test.user.response.getTaxAdministrationsByCityResponse;

import java.util.List;
import lombok.Data;

@Data
public class GetTaxAdministrationsByCityResponse {
	private List<DataItem> data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}
