package org.sensat.test.advertisement.response.getSearchAdvertisementPropertiesByCategoryId;

import lombok.Data;

@Data
public class DataItem{
	private int salesType;
	private boolean isSplitted;
	private Object data;
	private boolean expandable;
	private String suffixIcon;
	private String title;
	private String type;
	private int priority;
	private boolean expanded;
	private Object emptyDataMessage;
	private Object inputType;
	private int propertyId;
	private Object items;
	private String key;
	private int maxLength;
}
