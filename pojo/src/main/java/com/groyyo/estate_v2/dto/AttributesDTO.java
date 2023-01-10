package com.groyyo.estate_v2.dto;

import com.groyyo.core.dto.AbstractMongoDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AttributesDTO extends AbstractMongoDto {
    private String estateId;
    private String status;
    private String attributeName;
    private List<String> attributeValue;
}
