package org.sensat.test.advertisement.response.StoreSummaryReportResponse;

import lombok.Data;

import java.util.ArrayList;

@Data
public class StoreSummaryReportResponses {
    public ArrayList<Datum> data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
