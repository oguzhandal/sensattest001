package org.sensat.test.backoffice.response.totalCountOfMembersByDate;

import lombok.Data;

@Data
public class DetailsItem {
    private String date;
    private int userCount;
}
