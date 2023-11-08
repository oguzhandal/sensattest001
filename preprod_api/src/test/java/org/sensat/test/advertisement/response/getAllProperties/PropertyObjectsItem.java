package org.sensat.test.advertisement.response.getAllProperties;

import lombok.Data;

@Data
public class PropertyObjectsItem{
	private String displayName;
	private String name;
	private int externalPropertyId;
	private int id;
}
