/**
 * 
 */
package com.groyyo.core.user.acl.request.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
public class UpdateRoleRequestDto extends AddRoleRequestDto {

	@NotBlank(message = "Role Uuid is Mandatory")
	private String roleUuid;

	@NotBlank
	private Department department;

	@NotBlank
	private AccessLevel accessLevel;

}