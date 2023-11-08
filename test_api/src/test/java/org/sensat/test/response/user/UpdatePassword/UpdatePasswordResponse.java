package org.sensat.test.response.user.UpdatePassword;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UpdatePasswordResponse implements Serializable {
    public Object data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
