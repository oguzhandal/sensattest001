package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class GetAdvertisementsByTypeAndStatusRequest {
	private int salesType;
	private int advertisementStatus;
}
