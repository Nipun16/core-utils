package com.groyyo.core.user.acl.dto;

import com.groyyo.core.user.acl.request.dto.AddUserDeptLevelRoleRequestDto;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserDeptLevelRoleDto extends AddUserDeptLevelRoleRequestDto {
    String userDeptLevelUuid;

}
