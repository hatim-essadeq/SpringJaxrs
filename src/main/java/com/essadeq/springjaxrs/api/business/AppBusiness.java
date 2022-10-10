package com.essadeq.springjaxrs.api.business;

import com.essadeq.springjaxrs.api.v1.dto.Message;
import com.essadeq.springjaxrs.api.v1.dto.UserRequest;
import com.essadeq.springjaxrs.api.v1.dto.UserResponse;

import java.math.BigDecimal;
import java.util.List;

public interface AppBusiness {

    UserResponse createUser(UserRequest userRequest);

    List<UserResponse> usersGet();

    Message usersUserIdDelete(BigDecimal userId);

    UserResponse usersUserIdGet(BigDecimal userId);

    UserResponse usersUserIdPut(BigDecimal userId, UserRequest userRequest);
}
