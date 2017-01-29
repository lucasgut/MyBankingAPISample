package com.temenos.samples.mybankingapi.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private final Long id;
    private final String name;
    private final CustomerType type;
}