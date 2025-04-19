package com.kodtodya.practice.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private City city;
}
