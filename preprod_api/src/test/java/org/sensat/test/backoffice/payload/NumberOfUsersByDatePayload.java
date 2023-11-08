package org.sensat.test.backoffice.payload;

import lombok.Data;

@Data
public class NumberOfUsersByDatePayload {
    private String endDate;
    private String startDate;
}
