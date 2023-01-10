package com.groyyo.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum YesNoEnum {

    YES("Yes","Active"),NO("No","Inactive");
    private String option;
    private String activeOption;
}

