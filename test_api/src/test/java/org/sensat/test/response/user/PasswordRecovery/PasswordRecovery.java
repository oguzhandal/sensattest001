package org.sensat.test.response.user.PasswordRecovery;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class PasswordRecovery implements Serializable {
    public Datum data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
