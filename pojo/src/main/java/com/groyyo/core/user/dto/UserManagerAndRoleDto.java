package com.groyyo.core.user.dto;

import com.groyyo.core.user.acl.dto.RoleDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 *
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
public class UserManagerAndRoleDto {
	UserProfileDto userProfile;

	UserProfileDto manager;

	List<RoleDto> roles;
}
