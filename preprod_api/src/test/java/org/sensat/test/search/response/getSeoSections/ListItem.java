package org.sensat.test.search.response.getSeoSections;

import java.util.List;
import lombok.Data;

@Data
public class ListItem{
	private String type;
	private List<ItemsItem> items;
	private String key;
}
