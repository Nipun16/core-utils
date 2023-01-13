package com.groyyo.core.security.service;

public interface AuthService {

	void validateUrlPermission(String userId, String uri);

}