package com.essadeq.springjaxrs.api.ws.impl;


import com.essadeq.springjaxrs.api.business.AppBusiness;
import com.essadeq.springjaxrs.api.v1.UsersApi;
import com.essadeq.springjaxrs.api.v1.dto.Message;
import com.essadeq.springjaxrs.api.v1.dto.UserRequest;
import com.essadeq.springjaxrs.api.v1.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class WsImpl implements UsersApi {

    @Autowired
    AppBusiness business;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return business.createUser(userRequest);
    }

    @Override
    public List<UserResponse> usersGet() {
        return business.usersGet();
    }

    @Override
    public Message usersUserIdDelete(BigDecimal userId) {
        return business.usersUserIdDelete(userId);
    }

    @Override
    public UserResponse usersUserIdGet(BigDecimal userId) {
        return business.usersUserIdGet(userId);
    }

    @Override
    public UserResponse usersUserIdPut(BigDecimal userId, UserRequest userRequest) {
        return business.usersUserIdPut(userId, userRequest);
    }
}
