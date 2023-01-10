package com.groyyo.core.user.dto;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.base.enums.Department;
import com.groyyo.core.user.enums.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public class UserFilterDto {
	private List<String> userIds;

	private String name;

	private String mobile;

	private String isoCode;

	private String email;

	private UserType userType;

	private Boolean status;

	private Department department;

	private PaginationRequest pageRequest;
}
