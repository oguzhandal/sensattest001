package org.sensat.test.request.search.searchByFilter;

import java.util.List;
import lombok.Data;

@Data
public class SpecsFilter{
	private List<Object> bodyType;
	private List<Object> color;
	private List<Object> cities;
	private List<Object> fuel;
	private List<Object> guaranteeStatus;
	private List<Object> brandList;
	private List<Object> fromLease;
	private List<Object> sellers;
	private List<Object> gear;
	private List<Object> vehicleStatus;
}
