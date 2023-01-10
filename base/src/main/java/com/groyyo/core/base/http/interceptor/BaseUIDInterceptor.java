package com.groyyo.core.base.http.interceptor;

import com.groyyo.core.base.GroyyoConstants;
import lombok.extern.log4j.Log4j2;
import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Log4j2
public class BaseUIDInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

		String guid = UUID.randomUUID().toString().replace("-", ""); // globally unique identifier
		String luid = UUID.randomUUID().toString().replace("-", ""); // locally unique identifier

		guid = (null != request.getHeader(GroyyoConstants.GUID)) ? request.getHeader(GroyyoConstants.GUID) : guid;
		MDC.put(GroyyoConstants.GUID, guid);
		MDC.put(GroyyoConstants.LUID, luid);
		MDC.put(GroyyoConstants.REQUEST_PATH, request.getRequestURI());
		MDC.put(GroyyoConstants.QUERY_STRING, request.getQueryString());

		// Add Device Info in MDC from request Headers
		MDC.put(GroyyoConstants.APP_NAME, request.getHeader("appName"));
		MDC.put(GroyyoConstants.APP_VERSION, request.getHeader("appVersion"));
		MDC.put(GroyyoConstants.DEVICE, request.getHeader("device"));
		MDC.put(GroyyoConstants.PLATFORM, request.getHeader("platform"));
		MDC.put(GroyyoConstants.PLATFORM_VERSION, request.getHeader("platformVersion"));

		log.info("RequestReceived URI {} QueryString {} AppVersion {}", request.getRequestURI(), request.getQueryString(), request.getHeader("appversion"));

		request.setAttribute(GroyyoConstants.GUID, guid);
		request.setAttribute(GroyyoConstants.LUID, luid);

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		MDC.remove(GroyyoConstants.GUID);
		MDC.remove(GroyyoConstants.LUID);
		MDC.remove(GroyyoConstants.REQUEST_PATH);
		MDC.remove(GroyyoConstants.QUERY_STRING);
		MDC.remove(GroyyoConstants.REQ_UID);
		MDC.remove(GroyyoConstants.REQ_MOBILE);

		// Remove Device Info from MDC
		MDC.remove(GroyyoConstants.APP_NAME);
		MDC.remove(GroyyoConstants.APP_VERSION);
		MDC.remove(GroyyoConstants.DEVICE);
		MDC.remove(GroyyoConstants.PLATFORM);
		MDC.remove(GroyyoConstants.PLATFORM_VERSION);
	}

}
