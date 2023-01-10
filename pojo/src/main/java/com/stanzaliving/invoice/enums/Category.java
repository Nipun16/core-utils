package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum Category {

    CORPORATE("Corporate"),HOSTELS("Hostels"),NODALOFFICES("Nodal Offices"),KITCHEN("Kitchen"),APARTMENTSSTUDIO21("Apartments Studio 21");

    private String text;
}
