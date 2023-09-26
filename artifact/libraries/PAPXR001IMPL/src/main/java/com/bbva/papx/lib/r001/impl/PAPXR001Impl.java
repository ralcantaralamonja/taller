package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.customer.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The PAPXR001Impl class...
 */
public class PAPXR001Impl extends PAPXR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR001Impl.class);

	/**
	 * The execute method...
	 */



/*	@Override
	public CustomerDTO executeGetCustomer(String customerId) {
		if(customerId == null){
			return null;
		}
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerId(customerId);
		customerDTO.setGreeating("Ricardo");
		customerDTO.setName("Alcantara");

		//this.addAdvice("PAPX123456");

		LOGGER.info("PAPXR001 executeGetCustomer ::END");
		LOGGER.debug(customerDTO.toString());

		return customerDTO;

	}*/


	public String executeHolaMundo(String name) {

		return "Hola mundo para " + name;
	}


	@Override
	public void execute() {


	}


}
