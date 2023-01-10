package com.groyyo.core.dto;

import com.groyyo.core.enums.DocumentSide;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentFileDTO {
    private DocumentSide documentSide;

    private String url;

}
