package org.sensat.test.notification.payload;

import lombok.Data;

@Data
public class NotificationsPayload{
    private Integer page;
    private Integer pageSize;
    private Integer accountType;
    private Boolean displayAll;
    private Boolean onlyUnRead;
}