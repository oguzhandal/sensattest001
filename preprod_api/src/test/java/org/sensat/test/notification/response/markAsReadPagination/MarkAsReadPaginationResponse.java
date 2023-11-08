package org.sensat.test.notification.response.markAsReadPagination;

import lombok.Data;

@Data
public class MarkAsReadPaginationResponse{
	private Object data;
	private boolean success;
	private String responseMessage;
	private int responseCode;
}