package org.sensat.test.search.response.getRelatedAdvertisements;

import lombok.Data;

@Data
public class SeacrhFilter{
	private int bodyType;
	private String driveLine;
	private boolean is360View;
	private int motor;
	private boolean advertsWithVideos;
	private int color;
	private int fuel;
	private int fromLease;
	private boolean advertsNotOptional;
	private int maxPower;
	private int sellers;
	private boolean advertsWithPhotos;
	private int gear;
	private int vehicleStatus;
}