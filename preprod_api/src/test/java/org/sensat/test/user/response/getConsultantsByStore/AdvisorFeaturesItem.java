package org.sensat.test.user.response.getConsultantsByStore;

import lombok.Data;

@Data
public class AdvisorFeaturesItem{
	private String date;
	private Advisor advisor;
	private String storeNo;
	private String role;
	private String storeName;
	private String id;
	private String key;
}