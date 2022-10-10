package com.essadeq.springjaxrs.api.ws.config;

import com.essadeq.springjaxrs.api.ws.impl.ApiDescImpl;
import com.essadeq.springjaxrs.api.ws.impl.WsImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("")
public class WsConfig extends ResourceConfig {

    public WsConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        //add your webservice implement
        register(WsImpl.class);
        register(ApiDescImpl.class);
    }


}
