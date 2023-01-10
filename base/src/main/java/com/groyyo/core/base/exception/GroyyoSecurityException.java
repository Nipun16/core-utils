/**
 * 
 */
package com.groyyo.core.base.exception;

import lombok.Getter;

/**
 * 
 * @author nipunaggarwal
 *
 *
 */
@Getter
public class GroyyoSecurityException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	private final int statusCode;

	public GroyyoSecurityException(String message) {
		super(message);
		this.statusCode = -1;
	}

	public GroyyoSecurityException(Throwable cause) {
		super(cause);
		this.statusCode = -1;
	}

	public GroyyoSecurityException(String message, Throwable cause) {
		super(message, cause);
		this.statusCode = -1;
	}

	public GroyyoSecurityException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

}