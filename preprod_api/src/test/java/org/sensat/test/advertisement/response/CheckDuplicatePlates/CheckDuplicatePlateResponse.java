package org.sensat.test.advertisement.response.CheckDuplicatePlates;

import lombok.Data;

@Data
public class CheckDuplicatePlateResponse {
    public Datum data;
    public boolean success;
    public Object responseMessage;
    public int responseCode;
}
