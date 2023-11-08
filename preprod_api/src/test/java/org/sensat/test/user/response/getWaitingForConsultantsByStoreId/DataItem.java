package org.sensat.test.user.response.getWaitingForConsultantsByStoreId;

import lombok.Data;

@Data
public class DataItem{
	private Advisor advisor;
	private String role;
	private String storeName;
	private String id;
	private String key;
	private String status;
}