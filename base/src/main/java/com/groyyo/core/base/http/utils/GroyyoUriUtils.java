package com.groyyo.core.base.http.utils;

import lombok.experimental.UtilityClass;
import org.springframework.web.util.UriUtils;

/**
 * @author nipunaggarwal 
 *
 * @version 1.0
 *
 * @since 05-Mar-2021
 */

@UtilityClass
public class GroyyoUriUtils {
	public String encodeQueryParam(String path) {
		return UriUtils.encodeQueryParam(path, "UTF-8");
	}
}
