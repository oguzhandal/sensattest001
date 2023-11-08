package org.sensat.test.response.user.CreateUserBireysel;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class CreateUserIndividualResponse implements Serializable {
    public Datum data;
    public boolean success;
    public String responseMessage;
    public int responseCode;
}
