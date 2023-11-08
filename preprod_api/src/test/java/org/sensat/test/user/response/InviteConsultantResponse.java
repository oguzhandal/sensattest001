package org.sensat.test.user.response;

public class InviteConsultantResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;

	public Object getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public String getResponseMessage(){
		return responseMessage;
	}

	public int getResponseCode(){
		return responseCode;
	}
}
