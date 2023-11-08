package org.sensat.test.advertisement.payload;

import java.util.List;
import lombok.Data;

@Data
public class UpdateAdvertisementStatusRequest{
	private List<String> advertNo;
	private int statusId;
}
