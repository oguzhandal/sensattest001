package org.sensat.test.response.token;

import java.io.Serializable;
import java.util.Date;

@lombok.Data
public class Data {
    public String accessToken;
    public String tokenType;
    public int accessTokenExpiresIn;
    public Date createdTime;
    public Date accessTokenExpireDate;
}
