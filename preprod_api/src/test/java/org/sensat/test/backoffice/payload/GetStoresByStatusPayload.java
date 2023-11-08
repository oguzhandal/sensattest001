package org.sensat.test.backoffice.payload;

import lombok.Data;

@Data
public class GetStoresByStatusPayload {
    private int pageNumber;
    private int numberOfRecords;
    private int storeStatus;
}
