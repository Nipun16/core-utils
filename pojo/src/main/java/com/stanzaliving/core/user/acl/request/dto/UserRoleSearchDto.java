package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 * 
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleSearchDto {

	private String roleName;

	private Department department;

	private String accessLevelId;
}