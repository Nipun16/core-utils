/**
 * 
 */
package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 *
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto extends AbstractDto {

	private String roleName;

	private Department department;

	private AccessLevel accessLevel;

}