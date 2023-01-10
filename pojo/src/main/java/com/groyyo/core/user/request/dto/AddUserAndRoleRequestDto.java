package com.groyyo.core.user.request.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.Department;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddUserAndRoleRequestDto extends AddUserRequestDto {

    private Department roleDepartment;

    private List<String> rolesUuid;

    private AccessLevel accessLevel;

    private List<String> accessLevelEntityListUuid;

}
