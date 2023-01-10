package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.enums.AccessModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccessModuleDto {
    
    private AccessModule accessModule;
    private String accessModuleName;
}
