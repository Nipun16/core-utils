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
public class AddApiRequestDto {

	@NotBlank(message = "Api Name is Mandatory For Api")
	private String apiName;

	@NotBlank(message = "Api Action URL is Mandatory For Api")
	private String actionUrl;

	@NotBlank(message = "Api Service is Mandatory For Api")
	private String service;

}