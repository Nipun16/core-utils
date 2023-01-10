/**
 * 
 */
package com.groyyo.core.user.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.base.enums.Department;
import com.groyyo.core.user.enums.UserType;

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
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends AbstractDto {

	private String isoCode;

	private String mobile;

	private Boolean mobileVerified;

	private String email;

	private Boolean emailVerified;

	private UserType userType;

	private Department department;

	private String departmentName;
	
	private String firstName;

	private String lastName;
	
	private int otp;

}