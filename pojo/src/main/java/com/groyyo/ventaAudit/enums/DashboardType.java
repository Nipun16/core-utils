package com.groyyo.ventaAudit.enums;

import lombok.Getter;
import lombok.AllArgsConstructor;
@Getter
@AllArgsConstructor
public enum DashboardType {
    WEB("Web"),
    MOBILE("Mobile");
    private final String dashboardType;
}
