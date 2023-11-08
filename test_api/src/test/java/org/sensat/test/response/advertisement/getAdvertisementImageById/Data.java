package org.sensat.test.response.advertisement.getAdvertisementImageById;

import java.util.List;

@lombok.Data
public class Data {
    private int salesType;
    private Seller seller;
    private String firstImageUrl;
    private String advertNo;
    private String price;
    private String description;
    private String publishedDate;
    private String title;
    private String categoryName;
    private List<PropertiesItem> properties;
}