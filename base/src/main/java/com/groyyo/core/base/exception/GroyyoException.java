/**
 * 
 */
package com.groyyo.core.base.exception;

/**
 * 
 * @author nipunaggarwal
 *
 * 
 */
public class GroyyoException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public GroyyoException(String message) {
		super(message);
	}

	public GroyyoException(Throwable cause) {
		super(cause);
	}

	public GroyyoException(String message, Throwable cause) {
		super(message, cause);
	}

}