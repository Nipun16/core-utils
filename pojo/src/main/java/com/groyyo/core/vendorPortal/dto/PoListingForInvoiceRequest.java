package com.groyyo.core.vendorPortal.dto;

import com.groyyo.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PoListingForInvoiceRequest {

    private List<String> vendorUuids;
}
