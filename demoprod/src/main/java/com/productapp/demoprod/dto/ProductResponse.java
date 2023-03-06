package com.productapp.demoprod.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductResponse {

    private String id;
    private String name;
    private String disc;
    private BigDecimal price;

}
