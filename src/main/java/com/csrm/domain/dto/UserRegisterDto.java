package com.csrm.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Builder
public class UserRegisterDto {
    private String email;
    private String username;
    private Long phone;
}
