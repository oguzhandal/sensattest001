package org.sensat.test.response.user.GetAllTaxAdministrations;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Datum implements Serializable {
    public int value;
    public String label;
}
