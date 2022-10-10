package com.essadeq.springjaxrs.api.business.impl;

import com.essadeq.springjaxrs.api.dao.domains.User;

import java.util.HashMap;
import java.util.Map;

public class AbstractBusiness {
    protected Map<Long, User> userMap = new HashMap<>();

    protected Long id() {
        int size = userMap.size();
        return (long) ++size;
    }
}
