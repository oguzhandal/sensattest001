package org.sensat.test.user.response.viewUserHistory;

import lombok.Data;

@Data
public class UserHistoryItem {
    private int statusId;
    private int changedById;
    private int historyId;
    private String changedBy;
    private String changedFieldsInTheUser;
    private int id;
    private String userUpdateDate;
}
