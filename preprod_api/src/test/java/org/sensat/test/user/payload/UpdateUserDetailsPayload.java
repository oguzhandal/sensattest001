package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class UpdateUserDetailsPayload {
    private int gender;
    private String phone;
    private String surname;
    private Object citizenNumber;
    private int accountType;
    private String name;
    private String newEmail;
    private Object birthDate;
}
