package org.sensat.test.message.payload;


import lombok.Data;

@Data
public class GetUserConversationsPayload {
    private String searchText;
    private Integer pageIndex;
    private Integer pageSize;
}