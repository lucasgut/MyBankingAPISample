package com.temenos.samples.mybankingapi.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerType {
    @ApiModelProperty(value = "Customer type", allowableValues = "gold,silver,bronze")
    private final String type;
}