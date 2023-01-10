/**
 * 
 */
package com.stanzaliving.core.property.exception;

/**
 * 
 * @author nipunaggarwal
 *
 * 
 */
public class ParameterStoreParameterNotFoundRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ParameterStoreParameterNotFoundRuntimeException(String propertyName) {
		super(String.format("Parameter %s Not Found on Parameter Store", propertyName));
	}
}