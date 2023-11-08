package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserUpdatePassword implements Serializable {
    private String newPassword;
    private String newPasswordAgain;
    private String oldPassword;
}
