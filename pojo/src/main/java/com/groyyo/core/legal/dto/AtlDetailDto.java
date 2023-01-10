package com.groyyo.core.legal.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.legal.enums.AtlDetailsEnum;
import com.groyyo.core.legal.enums.LegalStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
public class AtlDetailDto extends AbstractDto {

    private String item;

    private String duration;

    private String scopeDefinition;

    private String remarks;

    private LegalStatus legalStatus;

    private String estateUuid;

    private AtlDetailsEnum atlDetailsEnum;
    
    private Boolean approvedBySandeep;

}
