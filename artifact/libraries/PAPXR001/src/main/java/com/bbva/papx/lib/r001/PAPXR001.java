package com.bbva.papx.lib.r001;

import com.bbva.papx.dto.customer.CustomerDTO;

import java.util.List;

/**
 * The  interface PAPXR001 class...
 */
public interface PAPXR001 {

    /**
     * The execute method...
     */
    /*	CustomerDTO	executeGetCustomer(String customerId);*/
    String executeHolaMundo(String name);

    String  executeIngresarCustomer(CustomerDTO customerDTO);

    List<String> executeLeerCustomer();

    void execute();
}
