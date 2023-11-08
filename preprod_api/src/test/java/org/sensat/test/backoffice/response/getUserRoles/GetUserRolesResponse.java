package org.sensat.test.backoffice.response.getUserRoles;

import java.util.List;

import lombok.Data;

@Data
public class GetUserRolesResponse {
    private List<DataItem> data;
    private boolean success;
    private String responseMessage;
    private int responseCode;
}
