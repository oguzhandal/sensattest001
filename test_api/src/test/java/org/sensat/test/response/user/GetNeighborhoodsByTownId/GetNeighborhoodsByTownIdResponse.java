package org.sensat.test.response.user.GetNeighborhoodsByTownId;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
@Data
@RequiredArgsConstructor
public class GetNeighborhoodsByTownIdResponse implements Serializable {
       public ArrayList<Datum> data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
