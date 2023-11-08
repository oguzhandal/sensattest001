package org.sensat.test.response.user.UsergetAuthorizedUserInfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UsergetAuthInfoResponse implements Serializable {
    public Datum data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
