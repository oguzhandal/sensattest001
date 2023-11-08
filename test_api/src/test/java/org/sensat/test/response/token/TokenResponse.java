package org.sensat.test.response.token;

import lombok.Data;

@Data
public class TokenResponse {
    public org.sensat.test.response.token.Data data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
