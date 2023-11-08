package org.sensat.test.request.token;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class PayloadUserRequest implements Serializable {
    private Integer channelCode;
    private String email;
    private String password;
    private String grantType;

}
