package org.sensat.expectedData.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserUpdatePasswordData implements Serializable {
    public static final String UserUpdatePasswordData="Yeni şifreniz bir önceki şifreniz ile aynı. Yeni bir şifre ile tekrar deneyiniz." ;
}
