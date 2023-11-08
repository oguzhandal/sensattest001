package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
public class UserCreate implements Serializable {
    private boolean dataProcessingConfirmation;
    private boolean kvkkApprove;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String passwordAgain;
    private String clientIpAddress;
    private String phone;
    private Integer accountType;
    private String commercialTitle;
    private Integer businessType;
    private Integer taxAdministrationId;
}
