package org.sensat.test.response.user.UpdateContactPermission;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UpdateContactPermissionResponse implements Serializable {
    public Object data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
