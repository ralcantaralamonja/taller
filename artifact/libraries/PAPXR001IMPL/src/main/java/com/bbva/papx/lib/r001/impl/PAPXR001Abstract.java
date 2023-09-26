package com.bbva.papx.lib.r001.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.papx.lib.r001.PAPXR001;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class PAPXR001Abstract extends AbstractLibrary implements PAPXR001 {

	protected ApplicationConfigurationService applicationConfigurationService;
	protected PAPXR001 papxr001;

	public void setPapxr001(PAPXR001 papxr001) {
		this.papxr001 = papxr001;
	}

	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}