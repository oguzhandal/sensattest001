package org.sensat.test.response.user.GetStoreWithDetails;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class GetStoreWithDetailsResponse implements Serializable {
    public Datum data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
