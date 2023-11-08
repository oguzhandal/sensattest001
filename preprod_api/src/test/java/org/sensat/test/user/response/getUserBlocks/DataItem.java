package org.sensat.test.user.response.getUserBlocks;

import lombok.Data;

@Data
public class DataItem{
	private int blockId;
	private String profilePictureUrl;
	private String blockDate;
	private boolean isCorporateUser;
	private String storeName;
	private String blockReasonDescription;
	private String userName;
	private String userSurname;
}
