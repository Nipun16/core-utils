package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserAccessLevelIdsByRoleNameWithFiltersDto {

    private Department department;
    private String roleName;
    private List<String> accessLevelId;
    private AccessLevel accessLevel;
    private List<String> cityLeadFilterUuids;
    private List<String> clusterManagerFilterUuids;
    private List<String> salesAssociateFilterUuids;
    private List<String> cityFilterUuids;
    private List<String> micromarketFilterUuids;
    private List<String> residenceFilterUuids;
}
