package org.sensat.test.user.payload;

import java.util.List;

import lombok.Data;

@Data
public class InviteConsultantPayload {
    private String storeNo;
    private List<Integer> consultantTypes;
    private String toEmail;
}
