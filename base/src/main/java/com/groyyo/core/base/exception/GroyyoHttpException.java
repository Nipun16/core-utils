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
public class GroyyoHttpException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	private int statusCode;

	public GroyyoHttpException(String message) {
		super(message);
	}

	public GroyyoHttpException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

	public GroyyoHttpException(Throwable cause) {
		super(cause);
	}

	public GroyyoHttpException(String message, Throwable cause) {
		super(message, cause);
	}

	public GroyyoHttpException(String message, int statusCode, Throwable cause) {
		super(message, cause);
		this.statusCode = statusCode;
	}
}