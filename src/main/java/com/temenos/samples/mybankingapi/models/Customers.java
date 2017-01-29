package com.temenos.samples.mybankingapi.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Customers {
    private final List<Customer> customers;
}