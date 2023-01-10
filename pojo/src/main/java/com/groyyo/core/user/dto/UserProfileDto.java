/**
 * 
 */
package com.groyyo.core.user.dto;

import java.time.LocalDate;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.user.enums.BloodGroup;
import com.groyyo.core.user.enums.Gender;
import com.groyyo.core.user.enums.MaritalStatus;
import com.groyyo.core.user.enums.Nationality;

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
public class UserProfileDto extends UserDto {

	private String firstName;

	private String middleName;

	private String lastName;

	private String secondaryEmail;

	private Department department;

	private boolean secondaryEmailVerified;

	private String secondaryIsoCode;

	private String secondaryMobile;

	private boolean secondaryMobileVerified;

	private Gender gender;

	private String profilePicture;

	private LocalDate birthday;

	private MaritalStatus maritalStatus;

	private LocalDate anniversaryDate;

	private Address address;
	
	private Nationality nationality;
	
	private BloodGroup bloodGroup;
	
	private String nextDestination;
	
	private LocalDate arrivalDate;
	
	private int ageLimit;

	private boolean status;
}