package org.sensat.expectedData.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserPasswordRecoveryData implements Serializable {
    public static final String passwordRecoveryData="Şifrenizi mailinize gelen linkten sıfırlayabilirsiniz." ;
}
