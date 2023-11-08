package org.sensat.test.advertisement.response.getAdvertisementById;

import java.util.List;
import lombok.Data;

@Data
public class OtherSpecsItem{
	private List<SpecsItem> specs;
	private String title;
}
