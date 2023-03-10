/**
 * 
 */
package com.groyyo.core.user.acl.request.dto;

import com.groyyo.core.user.acl.enums.RoleAccessType;
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
public class AddRoleAccessDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private String accessUuid;

	@NotNull
	private RoleAccessType roleAccessType;

}