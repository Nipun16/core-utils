/**
 * 
 */
package com.groyyo.core.user.request.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.groyyo.core.utilservice.annotations.EnsureNumber;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 * 
 */
@Getter
@Setter
@ToString(callSuper = true)
public class OtpValidateRequestDto extends LoginRequestDto {

	@NotBlank(message = "OTP cannot be blank")
	@Size(min = 4, max = 6, message = "OTP must be of 4-6 charaters")
	@EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
	private String otp;
}
