package org.sensat.test.advertisement.response.getAdvertisementVehicleDetailsById;

import java.util.List;
import lombok.Data;

@Data
public class GeneralSpecsResult{
	private List<OtherSpecsItem> otherSpecs;
	private List<GeneralSpecsItem> generalSpecs;
	private List<FeaturedSpecsItem> featuredSpecs;
}
