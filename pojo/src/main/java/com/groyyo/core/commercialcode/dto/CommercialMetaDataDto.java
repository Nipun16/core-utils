package com.groyyo.core.commercialcode.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommercialMetaDataDto {
    private String label;
    private String value;
    @Builder.Default
    private String note = "";
}
