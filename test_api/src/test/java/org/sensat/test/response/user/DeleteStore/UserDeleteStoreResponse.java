package org.sensat.test.response.user.DeleteStore;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UserDeleteStoreResponse implements Serializable {
    public Object data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
