package com.groyyo.core.user.request.dto;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDepartmentUserTypeDto {

	@NotNull(message = "User Id is mandatory to updates user type and department")
	private String userId;
	
	private UserType userType;

	private Department department;

}