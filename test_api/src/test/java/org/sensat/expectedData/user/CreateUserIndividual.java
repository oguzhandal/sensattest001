package org.sensat.expectedData.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class CreateUserIndividual implements Serializable {

    public static final String CreateUserIndividualMessage ="Telefon numaranızı onaylamak için telefonuna gelen doğrulama kodunu giriniz.";
}
