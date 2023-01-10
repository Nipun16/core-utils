/**
 * 
 */
package com.groyyo.core.user.acl.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.user.acl.enums.RoleAccessType;
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
public class RoleAccessDto extends AbstractDto {

	@NotBlank
	private String roleUuid;

	@NotBlank
	private RoleAccessType roleAccessType;

	@NotBlank
	private String accessUuid;

}