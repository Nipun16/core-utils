/**
 * 
 */
package com.groyyo.core.user.request.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class MobileEmailOtpRequestDto extends MobileOtpRequestDto {

	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email must be valid")
	private String email;

}