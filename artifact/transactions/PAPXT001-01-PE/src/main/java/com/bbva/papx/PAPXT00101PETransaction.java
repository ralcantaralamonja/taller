package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.papx.dto.customer.CustomerDTO;
import com.bbva.papx.lib.r001.PAPXR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Transaction to get a Customer
 *
 */
public class PAPXT00101PETransaction extends AbstractPAPXT00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00101PETransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		CustomerDTO  cliente =  new CustomerDTO();
		cliente.setName(this.getName());
		PAPXR001 papxR001 = this.getServiceLibrary(PAPXR001.class);

		String s = papxR001.executeIngresarCustomer(cliente);
		List<String>  q = papxR001.executeLeerCustomer();
		this.setNombres(q);
		this.setSaludo(s);
		this.setSeverity(Severity.OK);
		this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200);

		/*	// TODO - Implementation of business logic
		String customerId = this.getCustomerid();
		CustomerDTO customerDB = papxR001.executeGet1Customer(customerId);
		if(customerDB == null) {
			this.setSeverity(Severity.ENR);
			}
		else{
			this.setSeverity(Severity.OK);
			this.setCustomer(customerDB);
		}*/
	}
	}


