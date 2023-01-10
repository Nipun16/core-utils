package com.groyyo.legal_v2.DTO.LanguageApproval;

import com.groyyo.core.dto.AbstractMongoDto;
import com.groyyo.estate_v2.dto.propertyOnboarding.LegalAllRemarksResponseDto;
import com.groyyo.legal_v2.DTO.LegalTemplate.DeviationDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LanguageApprovalRequestDto extends AbstractMongoDto {

    @NotNull
    private String propertyId;

    private String templateDocument;

    private List<LegalAllRemarksResponseDto> bdRemarks;

    @NotNull
    private String propertyStatus;

    private List<DeviationDTO> deviationList;

}
