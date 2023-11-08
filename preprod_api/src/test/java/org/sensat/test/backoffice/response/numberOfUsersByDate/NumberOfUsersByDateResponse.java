package org.sensat.test.backoffice.response.numberOfUsersByDate;

import lombok.Data;

@Data
public class NumberOfUsersByDateResponse {
    private org.sensat.test.backoffice.response.numberOfUsersByDate.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
