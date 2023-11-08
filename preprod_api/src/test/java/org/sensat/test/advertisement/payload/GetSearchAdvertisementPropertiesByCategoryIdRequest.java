package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class GetSearchAdvertisementPropertiesByCategoryIdRequest {
    public String categoryId;
    public int salesType;
}
