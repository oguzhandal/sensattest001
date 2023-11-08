package org.sensat.test.notification.payload;

import lombok.Data;

@Data
public class SendSmsPayload{
    private String phoneNumber;
    private String message;
}