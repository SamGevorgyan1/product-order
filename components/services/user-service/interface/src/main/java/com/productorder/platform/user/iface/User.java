package com.productorder.platform.user.iface;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import java.util.UUID;

@Builder
@Getter
@Setter
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String verifyCode;
}
