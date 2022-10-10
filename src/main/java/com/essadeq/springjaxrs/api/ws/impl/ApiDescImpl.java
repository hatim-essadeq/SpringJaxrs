package com.essadeq.springjaxrs.api.ws.impl;


import com.essadeq.springjaxrs.api.business.impl.ApiDescriptionBusinessImpl;
import com.essadeq.springjaxrs.api.v1.ApiDescriptionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Service
public class ApiDescImpl implements ApiDescriptionApi {
    @Autowired
    ApiDescriptionBusinessImpl apiDescriptionBusiness;

    @Override
    public String getApiSwagger() {
        InputStream swaggerContract;
        swaggerContract = apiDescriptionBusiness.getApiSwagger();
        try {
            return new String(swaggerContract.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}