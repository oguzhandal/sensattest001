package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserDeleteAddresess implements Serializable {
    private Integer addressId;
}
