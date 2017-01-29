package com.temenos.samples.mybankingapi.controllers;

import com.google.common.collect.ImmutableList;
import com.temenos.samples.mybankingapi.models.Customer;
import com.temenos.samples.mybankingapi.models.CustomerType;
import com.temenos.samples.mybankingapi.models.Customers;
import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response.Status;

@Component
public class MyBankingApiController {

    public ResponseContext getCustomers(RequestContext requestContext) {
        return new ResponseContext()
                .status(Status.OK)
                .entity(Customers.builder()
                        .customers(ImmutableList.of(
                                Customer.builder()
                                        .id(0L)
                                        .name("Fred")
                                        .type(CustomerType.builder().type("silver").build())
                                        .build()))
                        .build());
    }

    public ResponseContext getCustomer(RequestContext requestContext, Long id) {
        return new ResponseContext()
                .status(Status.OK)
                .entity(Customer.builder()
                        .id(id)
                        .name("Fred")
                        .type(CustomerType.builder()
                                .type("silver").build()).build());
    }
}
