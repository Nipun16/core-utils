package com.groyyo.core.paymentPlan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum LineItemValue {

    LICENSE_FEE("LICENSE FEE"),
    CITY_HEAD_BUFFER("CITY HEAD BUFFER"),
    UPSELL("UPSELL"),
    PRICE_BUMP("PRICE BUMP"),
    PACKAGED_SERVICE_FEE("PACKAGED SERVICE FEE"),
    FOOD_SERVICE_FEE("FOOD SERVICE FEE"),
    SECURITY_DEPOSIT("SECURITY DEPOSIT"),
    ONBOARDING_CHARGE("ONBOARDING CHARGE"),
    MAINTENANCE_FEE("MAINTENANCE FEE"),
    ANNUAL_MAINTENANCE_FEE("ANNUAL MAINTENANCE FEE"),
    VAS_FEE("VAS FEE"),
    DISCOUNT("DISCOUNT"),
    PRICING_STRATEGY_AMOUNT("PRICING STRATEGY AMOUNT");

    private String name;
}
