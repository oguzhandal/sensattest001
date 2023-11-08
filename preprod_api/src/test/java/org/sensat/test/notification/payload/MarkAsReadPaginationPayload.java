package org.sensat.test.notification.payload;

import lombok.Data;

@Data
public class MarkAsReadPaginationPayload {
    private Integer page;
    private Integer pageSize;
}

