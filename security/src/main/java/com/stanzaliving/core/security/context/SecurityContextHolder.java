package com.stanzaliving.core.security.context;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.pojo.CurrentUser;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SecurityContextHolder {

	public static void setCurrentUser(CurrentUser user) {
		Assert.notNull(user, "User can't be null");

		RequestAttributes attributes = RequestContextHolder.currentRequestAttributes();

		attributes.setAttribute(getName(), user, getScope());
	}

	private static int getScope() {
		return RequestAttributes.SCOPE_REQUEST;
	}

	private static String getName() {
		return CurrentUser.class.getName();
	}

	@SuppressWarnings("unchecked")
	public static <T extends CurrentUser> T getCurrentUser() {
		RequestAttributes attributes = RequestContextHolder.currentRequestAttributes();
		Object scopedObject = attributes.getAttribute(getName(), RequestAttributes.SCOPE_REQUEST);
		return (T) scopedObject;
	}

	public static Map<String, String> getCurrentUserTokenHeader() {
		Map<String, String> map = new HashMap<>();

		try {
			CurrentUser currentUser = getCurrentUser();

			if (currentUser != null) {
				map.put(SecurityConstants.TOKEN_HEADER_NAME, currentUser.getToken());
			}
		} catch (Exception e) {
		}
		return map;
	}

}