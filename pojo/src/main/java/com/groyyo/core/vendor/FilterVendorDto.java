package com.groyyo.core.vendor;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.vendor.enums.VendorClassification;
import lombok.*;

import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class FilterVendorDto {
    private String vendorUuid;
    private Department department;
    private VendorClassification vendorClassification;
    private Collection<String> cityUuids;
    private Collection<String> itemUuids;
    private Collection<String> itemCodes;
    private boolean includeInactive;
}
