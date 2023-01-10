package com.groyyo.sfr.dto.propertyType;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilterPropertyTypeDto {
    List<String> propertyType;
    List<String> status;
}
