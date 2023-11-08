package org.sensat.test.backoffice.payload;

import lombok.Data;

@Data
public class GetCorporateClientDetailsByDatePayload {
    private String endDate;
    private String startDate;
}
