package org.sensat.test.advertisement.payload;

import java.util.List;
import lombok.Data;

@Data
public class UpdateAdvertisementOptionalStatusRequest{
	private List<Integer> advertisementId;
	private boolean isOptional;
}
