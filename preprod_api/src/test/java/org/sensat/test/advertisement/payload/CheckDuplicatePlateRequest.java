package org.sensat.test.advertisement.payload;

import lombok.Data;

@Data
public class CheckDuplicatePlateRequest {
    public String advertNo;
    public boolean isUpdate;
    public String plate;
    public int salesType;
}
