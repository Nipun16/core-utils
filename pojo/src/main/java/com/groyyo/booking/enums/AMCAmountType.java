package com.groyyo.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum AMCAmountType {

    MONTHLY("Monthly"),

    FIXED("Fixed");

    String amcAmountType;
}
