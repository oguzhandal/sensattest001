package org.sensat.test.user.response.updateUserDetails;

import lombok.Data;

@Data
public class UpdateUserDetailsResponse {
    private org.sensat.test.user.response.updateUserDetails.Data data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
