package com.groyyo.core.security.service;

import com.groyyo.core.base.common.dto.ResponseDto;
import com.groyyo.core.user.dto.UserProfileDto;

public interface AuthService {

	ResponseDto<UserProfileDto> validateToken(String token);

	void validateUrlPermission(String userId, String uri);

	ResponseDto<UserProfileDto> getUserProfile();
}