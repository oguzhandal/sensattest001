package org.sensat.test.request.advertisement;

import java.util.List;
import lombok.Data;

@Data
public class GetVehicleCompareRequest{
	private List<Integer> advertisementIds;
}
