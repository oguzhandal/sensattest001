package org.sensat.test.notification.payload;

import lombok.Data;

@Data
public class CreatePayload{
    private Integer userId;
    private Integer type;
    private String description;
    private String content;
    private String label;
    private Integer accountType;
}