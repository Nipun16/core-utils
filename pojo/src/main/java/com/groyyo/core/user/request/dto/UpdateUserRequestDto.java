/**
 * 
 */
package com.groyyo.core.user.request.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.user.dto.Address;
import com.groyyo.core.user.enums.BloodGroup;
import com.groyyo.core.user.enums.Gender;
import com.groyyo.core.user.enums.Nationality;

import com.groyyo.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequestDto {

	@NotNull(message = "User Id is mandatory to updates user")
	private String userId;

	private String email;

	private String firstName;

	private String lastName;

	private Gender gender;

	private String profilePicture;

	private LocalDate birthday;

	private Address address;

	private BloodGroup bloodGroup;

	private Nationality nationality;

	private String foriegnCountryCode;

	private String foriegnMobileNumber;

	private LocalDate dateOfArrival;

	private String nextDestination;

	private String userMobile;

	private Department department;

	private UserType userType;

	private String middleName;


}