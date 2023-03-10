/**
 * 
 */
package com.groyyo.core.user.acl.request.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class UserAccessDto {

	@NotBlank(message = "User Id is mandatory for ACL")
	private String userId;

	@NotBlank(message = "API Url is mandatory for ACL")
	private String url;
}