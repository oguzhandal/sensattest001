package org.sensat.test.user.payload;

import lombok.Data;

@Data
public class BlockUserPayload {
    private int blockReasonTypeId;
    private int blockedUserId;
    private int storeId;
}
