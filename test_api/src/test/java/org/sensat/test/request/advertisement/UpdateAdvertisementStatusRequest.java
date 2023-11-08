package org.sensat.test.request.advertisement;

import java.util.List;
import lombok.Data;

@Data
public class UpdateAdvertisementStatusRequest{
	private List<Integer> advertisementId;
	private int statusId;
}
