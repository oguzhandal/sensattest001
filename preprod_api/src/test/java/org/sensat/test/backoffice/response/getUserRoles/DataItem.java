package org.sensat.test.backoffice.response.getUserRoles;

import lombok.Data;

@Data
public class DataItem {
    private int roleId;
    private String roleName;
    private String description;
}
