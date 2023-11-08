package org.sensat.test.search.payload.searchByFilter;

import java.util.List;
import lombok.Data;

@Data
public class SpecsFilter{
	private List<Object> bodyType;
	private List<Object> driveLine;
	private List<Object> motor;
	private List<Object> color;
	private List<Object> cities;
	private List<Object> fuel;
	private List<Object> guaranteeStatus;
	private List<Object> driverLicenceClasses;
	private List<Object> brandList;
	private List<Object> insuranceStatus;
	private List<Object> fromLease;
	private List<Object> equipmentFilter;
	private List<Object> driverLicenceValidity;
	private List<Object> paymentType;
	private List<Object> leaseType;
	private List<Object> leasePeriod;
	private List<Object> options;
	private List<Object> maxPower;
	private List<Object> sellers;
	private List<Object> gear;
}