package com.first.spring.boot.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.first.spring.boot.app.resource.UserResource;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(UserResource.class);
    }
}
