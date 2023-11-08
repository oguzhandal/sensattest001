package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserUpdateStoreLogo implements Serializable {
    private Integer storeId;
    private String storeLogo;
}
