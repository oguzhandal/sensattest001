package org.sensat.expectedData.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class GetActivationMailData implements Serializable {
    public static final String GetActivationMailData="Hesabınız daha önce onaylanmıştır. Mevcut bilgileriniz ile giriş yapabilirsiniz.";
}
