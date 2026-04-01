package com.campushub.campus_hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
