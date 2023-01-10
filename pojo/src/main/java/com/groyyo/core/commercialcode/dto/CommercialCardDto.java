package com.groyyo.core.commercialcode.dto;

import com.groyyo.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommercialCardDto {

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private CommercialCardUserType commercialCardUserType;

    private Double monthlyRent;
    
    private Boolean modifyContractFlow = Boolean.FALSE;

    private String appliedCommercialCard;

}
