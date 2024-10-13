package com.csrm.service;

import com.csrm.domain.dto.UserRegisterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegisterServiceImpl implements UserRegisterService{

    @Override
    public String register(UserRegisterDto user) {
        return "";
    }
}
