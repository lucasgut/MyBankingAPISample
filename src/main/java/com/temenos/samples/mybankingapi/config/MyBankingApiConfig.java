package com.temenos.samples.mybankingapi.config;

import io.swagger.inflector.SwaggerInflector;
import io.swagger.inflector.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBankingApiConfig extends SwaggerInflector {

    @Autowired
    public MyBankingApiConfig(Configuration configuration) {
        super(configuration);
    }

}
