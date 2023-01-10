package com.groyyo.support.dto;

import com.groyyo.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceComplaintGroupMappingDto {

    private AccessLevel accessLevel;
    private List<String> headerList;
    private List<ResidenceGroupMappingDto> residenceGroupMappingDto;
    private Boolean hasChild;

}
