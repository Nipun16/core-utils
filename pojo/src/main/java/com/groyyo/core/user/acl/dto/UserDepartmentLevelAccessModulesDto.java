package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.AccessModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentLevelAccessModulesDto {
    
    private AccessModule accessModule;
    private String accessModuleName;
    private String roleUuid;
    private String userDepartmentLevelUuid;
    private AccessLevel accessLevel;
    private Map<String, String> accessLevelEntityUuidNameMap;
    private boolean isLeadTransferApplicable;
}
