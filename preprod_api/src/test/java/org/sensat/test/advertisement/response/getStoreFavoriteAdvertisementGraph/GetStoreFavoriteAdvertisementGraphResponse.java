package org.sensat.test.advertisement.response.getStoreFavoriteAdvertisementGraph;

import lombok.Data;

@Data
public class GetStoreFavoriteAdvertisementGraphResponse {
        public Datum data;
        public boolean success;
        public String responseMessage;
        public int responseCode;
}
