/**
 * 
 */
package com.stanzaliving.core.base.exception;

/**
 * 
 * @author nipunaggarwal
 *
 *
 *
 */
public class RequestAlreadyRejectedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public RequestAlreadyRejectedException(String message) {
		super(message);
	}

	public RequestAlreadyRejectedException(Throwable cause) {
		super(cause);
	}

	public RequestAlreadyRejectedException(String message, Throwable cause) {
		super(message, cause);
	}

}