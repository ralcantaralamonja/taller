package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.customer.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The PAPXR001Impl class...
 */
public class PAPXR001Impl extends PAPXR001Abstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR001Impl.class);

    /**
     * The execute method...
     */
    private static final String INSERT = "PAPX.INSERT_PAPX_CUSTOMER";
    private static final String SELECT = "PAPX.Select_PAPX_CUSTOMER";
    @Override
    public String executeHolaMundo(String name) {
        return "Hola mundo para " + name;
    }

    @Override
    public String executeIngresarCustomer(CustomerDTO customerDTO) {
        LOGGER.info("[APX-R1] INGRESANDO CLIENTE : {}", customerDTO);
        int resultado = 0;
        if (customerDTO != null) {
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("NAME", customerDTO.getName());
            LOGGER.info("[--------]");
            try {
                resultado = this.jdbcUtils.update(INSERT, parameter);
            } catch (NoResultException ex) {
                LOGGER.error(String.format("[Error al insertar nombre]"));

            }
        } else {
            LOGGER.info("Error");
        }
        return String.valueOf(resultado);
    }

    @Override
    public List<String> executeLeerCustomer() {
        LOGGER.info("Consultando clientes ");
        Map<String, Object> parameter = new HashMap<>();
        List<Map<String, Object>> clientes = null;
        try {
            clientes = this.jdbcUtils.queryForList(SELECT);
            LOGGER.info("Clientes {}",clientes);

        } catch (NoResultException ex) {
            LOGGER.error(String.format("[Error al consultar clientes]"));
        }
        List<String> nombres = new ArrayList<>();
          for (Map<String,Object> name :clientes ){
            nombres.add((String)name.get("NOMBRE"));
      }

         return nombres;
    }

    @Override
    public void execute() {

    }



}
