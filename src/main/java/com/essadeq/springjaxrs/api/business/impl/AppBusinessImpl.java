package com.essadeq.springjaxrs.api.business.impl;

import com.essadeq.springjaxrs.api.business.AppBusiness;
import com.essadeq.springjaxrs.api.dao.domains.User;
import com.essadeq.springjaxrs.api.v1.dto.Message;
import com.essadeq.springjaxrs.api.v1.dto.UserRequest;
import com.essadeq.springjaxrs.api.v1.dto.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppBusinessImpl extends AbstractBusiness implements AppBusiness {

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User u = new User();
        BeanUtils.copyProperties(userRequest, u);
        u.setId(id());
        userMap.put(u.getId(), u);
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(u, response);
        return response;
    }

    @Override
    public List<UserResponse> usersGet() {
        List<UserResponse> list = new ArrayList<>();
        userMap.values().forEach(user -> {
            UserResponse response = new UserResponse();
            BeanUtils.copyProperties(user, response);
            list.add(response);
        });
        return list;
    }

    @Override
    public Message usersUserIdDelete(BigDecimal userId) {
        userMap.remove(userId.longValue());
        Message message = new Message();
        message.setMessage("Deleted Successfully");
        message.setId(userId.toEngineeringString());
        return message;
    }

    @Override
    public UserResponse usersUserIdGet(BigDecimal userId) {
        UserResponse response = new UserResponse();
        User u = userMap.get(userId.longValue());
        BeanUtils.copyProperties(u, response);
        return response;
    }

    @Override
    public UserResponse usersUserIdPut(BigDecimal userId, UserRequest userRequest) {
        User exist = userMap.get(userId.longValue());
        BeanUtils.copyProperties(userRequest, exist);
        userMap.replace(exist.getId(), exist);
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(exist, response);
        return response;
    }
}
