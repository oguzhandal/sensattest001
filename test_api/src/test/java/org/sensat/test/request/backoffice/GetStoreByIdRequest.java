package org.sensat.test.request.backoffice;

import lombok.Data;

@Data
public class GetStoreByIdRequest {
    private int storeId;
    private String storeCode;
}
