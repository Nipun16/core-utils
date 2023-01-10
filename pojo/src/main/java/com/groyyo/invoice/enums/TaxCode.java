package com.groyyo.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum TaxCode {
    OPEX("OP");

    private String text;
}
