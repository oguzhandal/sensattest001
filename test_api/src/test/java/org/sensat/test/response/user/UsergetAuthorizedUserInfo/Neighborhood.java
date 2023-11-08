package org.sensat.test.response.user.UsergetAuthorizedUserInfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Neighborhood implements Serializable {
    public int value;
    public String label;
}
