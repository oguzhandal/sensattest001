package org.sensat.test.response.advertisement.getAllProperties;

import java.util.List;
import lombok.Data;

@Data
public class DataItem{
	private String propertyName;
	private String displayName;
	private int valueType;
	private List<Object> propertyObjects;
	private int priority;
	private int propertyId;
}
