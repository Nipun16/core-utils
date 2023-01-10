package com.groyyo.core.dto;

import com.groyyo.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentMetadataDTO {
    private DocumentTypeEnum documentType;

    private String idNumber;
}
