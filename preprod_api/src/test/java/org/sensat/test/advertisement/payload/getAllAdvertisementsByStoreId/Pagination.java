package org.sensat.test.advertisement.payload.getAllAdvertisementsByStoreId;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Pagination {
    public int currentPage;
    public int take;
}
