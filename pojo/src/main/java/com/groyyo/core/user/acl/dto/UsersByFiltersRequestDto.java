package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UsersByFiltersRequestDto {

    private AccessLevel accessLevel;
    private List<String> cityLeadFilterUuids;
    private List<String> clusterManagerFilterUuids;
    private List<String> salesAssociateFilterUuids;
    private List<String> cityFilterUuids;
    private List<String> micromarketFilterUuids;
    private List<String> residenceFilterUuids;
}
