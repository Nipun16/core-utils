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
public class TransactionFailException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public TransactionFailException(String message) {
		super(message);
	}

	public TransactionFailException(Throwable cause) {
		super(cause);
	}

	public TransactionFailException(String message, Throwable cause) {
		super(message, cause);
	}

}