package org.sensat.test.response.user.UsergetAuthorizedUserInfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class Store implements Serializable {
    public int id;
    public String name;
}
