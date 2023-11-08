package org.sensat.test.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class UserUpdateContactPermissions implements Serializable {
        private boolean callingApprove;
        private boolean smsApprove;
        private boolean mailingApprove;
}
