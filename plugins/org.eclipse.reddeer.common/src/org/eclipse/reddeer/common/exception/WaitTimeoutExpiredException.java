/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Red Hat, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.reddeer.common.exception;

/**
 * WaitTimeoutExpiredException indicates reaching timeout time period.
 * 
 * @author Vlado Pakan
 * 
 */
public class WaitTimeoutExpiredException extends RedDeerException {

	private static final long serialVersionUID = 5905873761753380173L;
	
	/**
	 * Creates WaitTimeoutExpiredException with the specified detail message.
	 * 
	 * @param message the detail message
	 */
	public WaitTimeoutExpiredException(String message) {
		super(message);
	}
	
	/**
	 * Constructs a new WaitTimeoutExpiredException with the specified detail
	 * message and cause.
	 * 
	 * @param message the detail message
	 * @param cause the cause of exception
	 */
	public WaitTimeoutExpiredException(String message, Throwable cause) {
		super(message, cause);
	}
}
