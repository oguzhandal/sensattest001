package org.sensat.test.response.user.GetUserConsultants;

import lombok.Data;

@Data
public class AdvisorFeaturesItem{
	private String date;
	private Advisor advisor;
	private String role;
	private String storeName;
	private String id;
	private String key;
}