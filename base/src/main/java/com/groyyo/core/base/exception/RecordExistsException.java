/**
 * 
 */
package com.groyyo.core.base.exception;

/**
 * 
 * @author nipunaggarwal
 *
 *
 *
 */
public class RecordExistsException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public RecordExistsException(String message) {
		super(message);
	}

	public RecordExistsException(Throwable cause) {
		super(cause);
	}

	public RecordExistsException(String message, Throwable cause) {
		super(message, cause);
	}

}