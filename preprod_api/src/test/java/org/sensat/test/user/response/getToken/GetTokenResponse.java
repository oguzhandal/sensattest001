package org.sensat.test.user.response.getToken;

import lombok.Data;

@Data
public class GetTokenResponse {
    private org.sensat.test.user.response.getToken.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
