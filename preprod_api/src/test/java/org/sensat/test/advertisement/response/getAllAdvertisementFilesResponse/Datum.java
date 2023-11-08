package org.sensat.test.advertisement.response.getAllAdvertisementFilesResponse;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Datum {
    public int fileType;
    public ArrayList<File> files;
}
