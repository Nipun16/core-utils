package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum VoucherType {
    TAXINVOICE("Tax Invoice"),PERFORMAINVOICE("Performa Invoice"),CREDITNOTE("Credit Note");

    private String text;



}
