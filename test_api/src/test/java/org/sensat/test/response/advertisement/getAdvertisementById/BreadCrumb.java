package org.sensat.test.response.advertisement.getAdvertisementById;

import java.util.List;
import lombok.Data;

@Data
public class BreadCrumb{
	private String advertNo;
	private List<ItemsItem> items;
}
