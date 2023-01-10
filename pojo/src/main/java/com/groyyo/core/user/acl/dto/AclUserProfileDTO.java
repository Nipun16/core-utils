package com.groyyo.core.user.acl.dto;

import com.groyyo.core.user.dto.UserProfileDto;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@ToString(callSuper = true)
@SuperBuilder
public class AclUserProfileDTO extends UserProfileDto {
    private List<UserDeptLevelRoleNameUrlExpandedDto> acl;
    private boolean fcmEnabled = true;
}
