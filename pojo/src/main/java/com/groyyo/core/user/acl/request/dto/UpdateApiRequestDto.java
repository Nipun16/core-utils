/**
 * 
 */
package com.groyyo.core.user.acl.request.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author nipunaggarwal
 *
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApiRequestDto extends AddApiRequestDto {

	@NotBlank(message = "Api Id is Mandatory For Api")
	private String apiUuid;

}