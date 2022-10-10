package com.essadeq.springjaxrs.api.business.impl;




import com.essadeq.springjaxrs.api.business.ApiDescriptionBusiness;
import com.essadeq.springjaxrs.api.v1.ApiDescriptionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

import java.io.InputStream;


@Service
public class ApiDescriptionBusinessImpl implements ApiDescriptionBusiness {
    @Autowired
    BuildProperties buildProperties;

    @Override
    public InputStream getApiSwagger() {

        return ApiDescriptionApi.class.getClassLoader()
                .getResourceAsStream("springjaxrs-api/springjaxrs-api.yaml");
    }



}
