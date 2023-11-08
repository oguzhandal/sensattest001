package org.sensat.test.response.user.DeleteProfilePhoto;

import lombok.Data;

@Data
public class DeleteProfilePhotoResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}