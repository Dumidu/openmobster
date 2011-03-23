/**
 * Copyright (c) {2003,2011} {openmobster@gmail.com} {individual contributors as indicated by the @authors tag}.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openmobster.core.mobileCloud.api.service;

import org.openmobster.core.mobileCloud.android.errors.BaseException;

/**
 * Any exception or error that occurs on the device side during a Mobile Service Bean Invocation
 * 
 * @author openmobster@gmail.com
 *
 */
public final class ServiceInvocationException extends BaseException 
{
	/**
	 * 
	 * @param className
	 * @param methodName
	 * @param parameters
	 */
	public ServiceInvocationException(String className, String methodName, Object[] parameters)
	{
		super(className, methodName, parameters);
	}
}
