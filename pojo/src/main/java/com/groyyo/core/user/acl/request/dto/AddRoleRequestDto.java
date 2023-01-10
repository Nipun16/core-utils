/**
 * 
 */
package com.groyyo.core.user.acl.request.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddRoleRequestDto {

	@NotBlank(message = "Role Name is Mandatory")
	private String roleName;

	@NotNull
	private Department department;

	@NotNull
	private AccessLevel accessLevel;

	@NotBlank
	private String parentRoleUuid;

}