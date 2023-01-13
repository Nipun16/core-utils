package com.groyyo.core.security.service.impl;

import org.springframework.http.HttpStatus;

import com.groyyo.core.base.common.dto.ResponseDto;
import com.groyyo.core.base.exception.GroyyoHttpException;
import com.groyyo.core.base.exception.GroyyoSecurityException;
import com.groyyo.core.base.http.GroyyoRestClient;
import com.groyyo.core.security.service.AuthService;
import com.groyyo.core.user.client.api.AuthClientApi;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthServiceImpl implements AuthService {

	private AuthClientApi authClientApi;

	public AuthServiceImpl(String basePath) {
		authClientApi = new AuthClientApi(new GroyyoRestClient(basePath));
	}

	@Override
	public void validateUrlPermission(String userId, String uri) {

		ResponseDto<Boolean> responseDto = checkUrlPermission(userId, uri);

		if (responseDto == null || !responseDto.getData()) {
			throw new GroyyoSecurityException("You are not allowed to access this url", HttpStatus.FORBIDDEN.value());
		}

	}

	private ResponseDto<Boolean> checkUrlPermission(String userId, String url) {

		ResponseDto<Boolean> responseDto = null;

		try {
			responseDto = authClientApi.checkUrlPermission(userId, url);
		} catch (GroyyoSecurityException
				| GroyyoHttpException e) {
			throw e;
		} catch (Exception e) {
			log.error("Error checking user permission for url: ", e);
		}

		return responseDto;
	}
}