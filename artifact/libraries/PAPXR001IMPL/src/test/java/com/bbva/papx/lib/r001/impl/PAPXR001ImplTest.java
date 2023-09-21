package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.customer.CustomerDTO;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class PAPXR001ImplTest extends TestCase {
    private PAPXR001Impl papxr001;

    @Before
    public void setUp() {
        papxr001 = new PAPXR001Impl();
    }

    @Test
    public void executeGetCustomerNull() {
        CustomerDTO customerDTO = papxr001.executeGetCustomer(null);
        Assert.assertNull(customerDTO);
        System.out.println(customerDTO);
    }
    @Test
    public void executeGetCustomerOK() {
        CustomerDTO customerDTO = papxr001.executeGetCustomer("123456789");
        assertNotNull(customerDTO);
        System.out.println(customerDTO);
}
}