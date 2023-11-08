package org.sensat.test.request.advertisement;

import java.util.List;
import lombok.Data;

@Data
public class UpdateAdvertisementOptionalStatusRequest{
	private List<Integer> advertisementId;
	private boolean isOptional;
}
