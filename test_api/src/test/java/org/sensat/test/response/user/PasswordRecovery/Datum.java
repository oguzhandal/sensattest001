package org.sensat.test.response.user.PasswordRecovery;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class Datum implements Serializable {
    public boolean isShowCaptcha;
}
