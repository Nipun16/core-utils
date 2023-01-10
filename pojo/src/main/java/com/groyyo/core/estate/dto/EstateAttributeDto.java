package com.groyyo.core.estate.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EstateAttributeDto extends AbstractDto {

    private String estateUuid;

    private String attributeName;

    private String attributeValue;

}
