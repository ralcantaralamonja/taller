package com.bbva.papx.dto.customer;

import java.io.Serializable;

/**
 * The CustomerDTO class...
 */
public class CustomerDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String greeating;
	private String name;
	public CustomerDTO(){
		super();
	}



	public String getGreeating() {
		return greeating;
	}

	public void setGreeating(String greeating) {
		this.greeating = greeating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerDTO{" +
				", firstName='" + greeating + '\'' +
				", lastName='" + name + '\'' +
				'}';
	}
}
