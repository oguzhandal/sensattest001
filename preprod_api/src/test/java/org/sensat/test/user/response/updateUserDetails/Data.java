package org.sensat.test.user.response.updateUserDetails;

@lombok.Data
public class Data {
    private boolean isRegisterPhoneConfirmed;
    private int otpDurationInSeconds;
    private boolean isEditable;
    private Object otpProcessId;
}
