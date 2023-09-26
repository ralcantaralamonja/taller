package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractPAPXT00101PETransaction extends AbstractTransaction {

	public AbstractPAPXT00101PETransaction(){
	}


	/**
	 * Return value for input parameter name
	 */
	protected String getName(){
		return (String)this.getParameter("name");
	}

	/**
	 * Set value for String output parameter saludo
	 */
	protected void setSaludo(final String field){
		this.addParameter("saludo", field);
	}
}
