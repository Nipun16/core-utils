package com.groyyo.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public enum CommercialCardUserType {
    SCHOLAR,
    SUITES,
    MANAGED_APARTMENT,
    MANAGED_APARTMENTS,
    ALL,
    PROFESSIONAL
}
