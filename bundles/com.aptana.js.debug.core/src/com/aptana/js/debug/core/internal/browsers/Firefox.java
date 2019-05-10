/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.js.debug.core.internal.browsers;

import java.io.File;

/**
 * @author Max Stepanov
 */
public final class Firefox
{

	private Firefox()
	{
	}

	/**
	 * isBrowserExecutable
	 * 
	 * @param browserExecutable
	 * @return boolean
	 */
	public static boolean isBrowserExecutable(String browserExecutable)
	{
		String name = new File(browserExecutable).getName();
		if (name.toLowerCase().indexOf("firefox") != -1) //$NON-NLS-1$
		{
			return true;
		}
		return false;
	}

}
